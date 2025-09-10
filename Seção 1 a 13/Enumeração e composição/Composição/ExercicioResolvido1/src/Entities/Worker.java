package Entities;

import Entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // associações -1 departamente e varios contratos:
    private Departament departament;

    private List<HourContract> contracts = new ArrayList<>();

    // quando tiver uma composição tem-muitos, não devemos incluir a lista no construtor

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // n posso ter um metodo setlist aqui pois eu ja declarei a lista acima e não posso trocala


    // METODÓS

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();

        for (HourContract c : contracts){
            cal.setTime(c.getDate());

            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
                if(year == c_year && month == c_month){
                    sum += c.totalValue();
                }

            }
                   return sum;
        }


    }





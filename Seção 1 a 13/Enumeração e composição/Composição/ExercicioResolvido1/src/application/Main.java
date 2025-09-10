package application;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter departament´s name: ");
        String departamentName = s.nextLine();

        System.out.println("Enter Worker data: ");
        System.out.println("Name: ");
        String workerName = s.nextLine();

        System.out.println("Level: ");
        String workerLevel = s.nextLine();

        System.out.println("Base Salary: ");
        double workerBaseSalary = s.nextDouble();


        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Departament(departamentName));


        System.out.println("How many contracts to this worker? ");
        int qtde = s.nextInt();

            for (int i = 1; i <= qtde; i++){
                System.out.println("Enter contract #" + i + " data: ");

                System.out.println("Date (DD/MM/YYYY): ");
                Date contractDate = sdf.parse(s.next());

                System.out.println("Value per hour: ");
                double valueperhour = s.nextDouble();

                System.out.println("Duration (hours): ");
                int hours = s.nextInt();


                HourContract contract = new HourContract(contractDate, valueperhour, hours);

                worker.addContract(contract);

            }

        System.out.println();

        System.out.println("Enter mounth and year to calculate income(MM/YYYY): ");
        String monthAndYear = s.next();
                                                            //posição em que a string será cortada
        int month = Integer.parseInt(monthAndYear.substring(0, 2));

        int year = Integer.parseInt(monthAndYear.substring(3));


        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for: " + monthAndYear + " : " + String.format("%.2f", worker.income(year, month)));






            s.close();
    }
}
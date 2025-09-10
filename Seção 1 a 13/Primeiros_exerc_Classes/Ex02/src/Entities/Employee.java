package Entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double NetSalary(){
        return salary - tax;
    }

    public double IncreaseSalary(double per){
        return salary - tax + (salary * (per/100));
    }

}

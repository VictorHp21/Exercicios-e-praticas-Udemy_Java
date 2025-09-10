package Application;

import Entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Employee x;
        x = new Employee();

        System.out.println("NAME: ");
        x.name = s.nextLine();
        //s.close();
        System.out.println("Gross Salary: ");
        x.salary = s.nextDouble();
        System.out.println("Tax: ");
        x.tax = s.nextDouble();

        System.out.println("Employee: " + x.name + " $ " + x.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        double per = s.nextDouble();
        System.out.println("Updated data: " + x.name + ", $ " + x.IncreaseSalary(per));



    }
}

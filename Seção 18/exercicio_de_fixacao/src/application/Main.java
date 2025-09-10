package application;

import Entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        File path = new File("C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 18\\exercicio_de_fixacao\\funcionarios.csv");


        List<Employee> lista = new ArrayList<>();



        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            br.readLine();

            String line = br.readLine();


            while (line != null){
                String[] fields = line.split(",");

                lista.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();

            }

            System.out.println("Enter a value: ");
            Double valor = s.nextDouble();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> emails = lista.stream()
                    .filter(p -> p.getSalary() > valor)
                    .map(p -> p.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", valor) + ": ");
            emails.forEach(System.out::println);



          Double salaryM =   lista.stream()
                    .filter(p -> p.getName() .toUpperCase().startsWith("M"))
                    .map(p -> p.getSalary())
                    .reduce(0.0, (a, b) -> a + b);


            System.out.println("Sum of salary for people whose name starts with 'M': " + String.format("%.2f", salaryM));






        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s.close();
    }
}

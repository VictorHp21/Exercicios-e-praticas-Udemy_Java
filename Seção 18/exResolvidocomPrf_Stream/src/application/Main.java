package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import entities.Product;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> lista = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                lista.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }


        // para calcular a media de precos
        // pipeline:

        double avg = lista.stream()
                .map(p -> p.getPrice()) // uso do reduce para fazer a somatoria
                .reduce(0.0, (x, y) -> x + y) / lista.size();


            System.out.println("Average price:" + String.format("%.2f", avg));

        // nomes dos produtos com preco abaixo da media em ordem decrescente

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase()
                    .compareTo(s2.toUpperCase());



         List<String> names = lista.stream()
                 .filter(p -> p .getPrice() < avg)
                 .map(p -> p.getName()) // sorted usado para ordenar
                 .sorted(comp.reversed())
                 .collect(Collectors.toList());

         names.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }







        sc.close();








    }
}

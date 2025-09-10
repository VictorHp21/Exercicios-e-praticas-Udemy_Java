package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

       File path = new File("C:\\Users\\victo\\OneDrive\\Desktop\\Curso JAVA Udemy\\Praticas com intellij\\Seção 18\\exercicioResolvido_Stream\\produtos.txt");

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           br.readLine();

           String prod = br.readLine();
           while (prod != null) {
               String[] vect = prod.split(",");
               String name = vect[0];
               Double price = Double.parseDouble(vect[1]);
               Product product = new Product(name, price);
               System.out.println(product);
               products.add(product);
               prod = br.readLine();
           }

       } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
       }
                                                                                     // soma todos os precos   // se lista estiver vazia retorna 0
       double media = products.stream().map(p -> p.getPrice().doubleValue()).reduce(Double::sum).orElse(0.0) /products.size();

        System.out.println("Media: " + String.format("%.2f", media));

    List<String> nomesDescrecente = products.stream().filter(p -> p.getPrice() < media).sorted(Comparator.comparing(Product::getPrice).reversed()).map(p -> p.getName() + ": " + p.getPrice()).collect(Collectors.toList());

    nomesDescrecente.forEach(System.out::println);


    }
}

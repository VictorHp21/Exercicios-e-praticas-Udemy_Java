package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("HD case", 80.90));
        lista.add(new Product("Mouse", 50.00));

        // stream - que atraves de uma função map que percorre a lista e transforma os nomes em maiusculo
        // o collect - transforma o stream em uma lista
                                              // aplicar a funcao UpperCaseName a cada membro da lista
       // List<String> names = lista.stream().map(new UpperCaseName()).collect(Collectors.toList());



        // com metdo estatico na classe Product

        //List<String> names = lista.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());


        // com metdo estatico na classe Product

        //List<String> names = lista.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());


        // expressao lambda

        Function<Product, String> func = p -> p.getName().toUpperCase();

        // List<String> names = lista.stream().map(func).collect(Collectors.toList());




        // expressao lambda inline

        List<String> names = lista.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


       names.forEach(System.out::println);


    }
}

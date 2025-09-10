package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("HD case", 80.90));
        lista.add(new Product("Mouse", 50.00));

        // metodo default forEach

        // implementação de um consumer
        //lista.forEach(new PriceUpdate());

        // consumer com metodo estatico sendo chamado de uma classe
        //lista.forEach(Product::staticPriceUpdate);

        // consumer com metodo NÃO estatico sendo chamado de uma classe
        //lista.forEach(Product::nonStaticPriceUpdate);

        // expressão lambda declarada

        double priceFactor = 1.1;

         /* Consumer<Product> cons = p -> p.setPrice(p.getPrice() * priceFactor);

        lista.forEach(cons); */


        // expressão lambda inline

        lista.forEach(p -> p.setPrice(p.getPrice() * priceFactor));


        lista.forEach(System.out::println);



    }
}

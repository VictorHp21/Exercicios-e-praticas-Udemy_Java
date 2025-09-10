package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("HD case", 80.90));
        lista.add(new Product("Mouse", 50.00));


        // para remover todo mundo de preço 100 ou mais
        // expressão lambda //predicato na forma de expressão lambda
        //lista.removeIf(p -> p.getPrice() >= 100.0);

        // predicato sendo implementado manualmente a interface
        //lista.removeIf(new ProductPredicate());

        // com o metodo estatico na classe -- static method reference
        //lista.removeIf(Product::staticProductPredicate);

        // com o metodo nao estatico na classe
        //lista.removeIf(Product::nonStaticProductPredicate);


        // expressão lambda declarada

       double min = 100.0;
/* 
        Predicate<Product> pred = p -> p.getPrice() >= min;

        lista.removeIf(pred); */


        // expressão lambda inline

        lista.removeIf( p -> p.getPrice() >= min);




        lista.forEach(System.out::println);

    }
}

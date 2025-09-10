package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //  uma ANONYMOUS CLASS
        /* Comparator<Product> comp = new Comparator<Product>(){

            @Override
            public int compare(Product p1, Product p2) {
                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
            }
        };

         list.sort(comp);
         */



        // passar como argumento um COMPARATOR
        //list.sort(new Mycomparator());


        // expressão LAMBDA com chaves
        // função anonima                             (Arrow Function)
        /* Comparator<Product> comp = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        }; */


        // expressão LAMBDA sem chaves
        // Comparator<Product> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());


                  // sintaxe de expressão LAMBDA (direto no argumento)
        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}

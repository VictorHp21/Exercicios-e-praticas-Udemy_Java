package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Crie um programa que leia nomes de produtos e seus preços,
        e depois use um Consumer<Produto> para aplicar um desconto de 10% em
        cada um e imprimir o novo valor.
         */

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("HD case", 80.90));
        lista.add(new Product("Mouse", 50.00));


        // instanciando o Consumer
        lista.forEach(new ProductConsumer());

        // expressão  lambda
        lista.forEach(p -> p.setPrice(p.getPrice() - p.getPrice() * 0.1));

        System.out.println("Produtos com 10% de desconto: ");
        lista.forEach(System.out::println);
    }
}

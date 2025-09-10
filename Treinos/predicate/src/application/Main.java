package application;



import util.IntPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Crie um programa que peça ao usuário uma lista de números inteiros e depois filtre apenas os números pares usando um Predicate<Integer>.
        Ao final, exiba apenas os números pares. */

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();


        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Digite um número: ");
            lista.add(sc.nextInt());
        }

        List<Integer> pares = new ArrayList<>();

        // instanciado um objeto da classe IntPredicate
        pares = lista.stream().filter(new IntPredicate()).toList();

        // expressão lambda
        pares = lista.stream().filter(i -> i % 2 == 0).toList();

        System.out.println("Números pares: ");
        pares.forEach(System.out::println);



        sc.close();

    }
}

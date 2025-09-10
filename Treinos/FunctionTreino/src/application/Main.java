package application;

import util.FunctionIniciais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Crie um programa que leia nomes completos e use um Function<String,
        String> para converter cada nome para somente as iniciais em maiúsculas.
        Exemplo: "joão da silva" → "J.D.S."
        */

        List<String> nomes = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um nome completo: ");
        String nome1 = s.nextLine();

        System.out.println("Digite outro nome completo: ");
        String nome2 = s.nextLine();

        nomes.add(nome1);
        nomes.add(nome2);

        FunctionIniciais f = new FunctionIniciais();
        System.out.println(f.apply(nomes.get(0)));
        System.out.println(f.apply(nomes.get(1)));

    }
}

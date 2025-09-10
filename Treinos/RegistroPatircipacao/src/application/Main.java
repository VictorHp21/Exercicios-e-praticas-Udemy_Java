package application;

import entities.Participante;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Participante> participantes = new HashSet<>();

        Participante p1 = new Participante("123456789", "Joao");
        Participante p2 = new Participante("123456789", "Pedro");
        Participante p3 = new Participante("456789123", "Ana");
        Participante p4 = new Participante("784569456", "Antony");

        participantes.add(p1);
        participantes.add(p2);
        participantes.add(p3);
        participantes.add(p4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();

        Participante novo = new Participante(cpf, null);

        if (participantes.contains(novo)) {
            System.out.println("Já existe um participante com esse CPF.");
        } else {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            participantes.add(new Participante(cpf, nome));
            System.out.println("Participante adicionado com sucesso.");
        }







        for (Participante participante : participantes) {
            System.out.println(participante.getCpf() + " " + participante.getNome());
        }

    }
}

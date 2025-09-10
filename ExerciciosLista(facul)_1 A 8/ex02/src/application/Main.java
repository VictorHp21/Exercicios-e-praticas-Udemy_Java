package application;

import Model.entities.Aluno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite quantos alunos deseja inserir");
        int n = s.nextInt();

        List<Aluno> alunos = new ArrayList<>();


        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno #" + (i+1) +": ");
            String nome = s.next();
            while (true){
                try {
                    System.out.println("Digite o codigo do aluno: ");
                    int cod = s.nextInt();

                    contador++;

                    alunos.add(new Aluno(nome, cod, contador));

                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Código inválido. Digite um número inteiro.");
                    s.nextLine(); // Limpa buffer
                }
            }




        }

        System.out.println("O numero de alunos cadastrados e: " + alunos.size());


        System.out.println("Os alunos cadastrados sao: ");

        for (Aluno al: alunos){
            System.out.println(al.toString());
        }


        System.out.println("A chave dos alunos é: ");

        for (Aluno al: alunos){
            System.out.println(al.getKey());
        }

        System.out.println("Saindo...");
        s.close();










    }
}

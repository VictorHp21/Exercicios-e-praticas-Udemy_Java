package application;

import entities.Gerencia_produto;
import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        Gerencia_produto gerenciador = new Gerencia_produto();
        do {
            menu();
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    int id = 0;
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.next();
                    sc.nextLine();
                    System.out.println("Digite o preco do produto: ");
                    double preco = sc.nextDouble();
                    gerenciador.cadastrar(new Produto(id, nome, preco));
                    break;

                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nome2 = sc.next();
                    gerenciador.remover(nome2);
                    break;

                case 3:
                    System.out.println("Digite o nome do produto: ");
                    String nome3 = sc.next();
                    gerenciador.buscar(nome3);
                    break;

                case 4:
                    gerenciador.listar();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

            }
        } while (opcao != 5);

    }



    public static void menu(){
        System.out.println("1 - Cadastrar produto\n" +
                "2 - Remover produto\n" +
                "3 - Buscar produto\n" +
                "4 - Listar produtos\n" +
                "5 - Sair");
    }
}

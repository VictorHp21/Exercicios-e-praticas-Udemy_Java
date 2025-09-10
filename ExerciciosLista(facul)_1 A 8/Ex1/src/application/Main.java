package application;

import entitities.Funcionario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        int opcao = 0;


        try {
            while (opcao != 4) {
                menu();
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 1:
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        int codigo = 0;
                        while (true) {
                            try {
                                System.out.print("Código: ");
                                codigo = sc.nextInt();
                                sc.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Código inválido. Digite um número inteiro.");
                                sc.nextLine(); // Limpa buffer
                            }
                        }

                        int idade = 0;
                        while (true) {
                            try {
                                System.out.print("Idade: ");
                                idade = sc.nextInt();
                                sc.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Idade inválida. Digite um número inteiro.");
                                sc.nextLine();
                            }
                        }

                        double salario = 0;
                        while (true) {
                            try {
                                System.out.print("Salário: ");
                                salario = sc.nextDouble();
                                sc.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Salário inválido. Digite um valor numérico (ex: 2500.75).");
                                sc.nextLine();
                            }
                        }

                        funcionarios.add(new Funcionario(nome, codigo, idade, salario));
                        break;

                    case 2:
                        int contador = 1;
                        for (Funcionario func: funcionarios){

                            System.out.println("******* FUNCIONARIOS *******");
                            System.out.println("Funcionario #" + contador);
                            System.out.println(func);
                            contador++;
                        }
                        break;

                    case 3:
                        System.out.println("Digite o codigo do funcionario que deseja buscar: ");
                        int codigoBusca = sc.nextInt();

                        boolean encontrado = false;

                        for (Funcionario func: funcionarios) {
                            if (func.getCodigo() == codigoBusca) {
                                System.out.println(func);
                                encontrado = true;
                                break;

                            }
                        }
                             if (!encontrado){
                                System.out.println("Funcionario não encontrado");

                            }


                        break;


                    case 4:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira o tipo de dado correto.");
            sc.nextLine(); // limpa o buffer
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            sc.nextLine(); // limpa o buffer
        }






    }

    public static void menu() {
        System.out.println("******* MENU *******");
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Listar Funcionarios");
        System.out.println("3 - Buscar Funcionario");
        System.out.println("4 - Sair");
        System.out.println("*********************");
    }
}

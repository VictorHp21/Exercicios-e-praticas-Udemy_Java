package application;

import entitites.Funcionario;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Map<String, MinhaClasse> mapa = new HashMap<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Map<String, Funcionario> lista_funcionarios = new java.util.HashMap<>();

        lista_funcionarios.put("123521", new Funcionario("joao", "456", 1560.20));
        lista_funcionarios.put("42036", new Funcionario("Maria", "412", 25678));
        lista_funcionarios.put("6952", new Funcionario("Leandro", "123", 80000));
        lista_funcionarios.put("212589", new Funcionario("Pedro", "789", 1200.89));


        int opcao = 0;
        while (opcao != 5) {
            menu();

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionario");
                    String name = sc.nextLine();
                    System.out.println("Digite o rg do funcionario");
                    String rg = sc.nextLine();
                    System.out.println("Digite o salario do funcionario");
                    double salario = sc.nextDouble();
                    System.out.println("Digite o cpf do funcionario");
                    String cpf = sc.next();
                     if (lista_funcionarios.containsKey(cpf)) {
                        System.out.println("Funcionario ja cadastrado");
                        System.out.println("------------------");
                        opcao = 0;
                     }


                    lista_funcionarios.put(cpf, new Funcionario(name, rg, salario));
                    break;
                case 2:
                    System.out.println("Digite o cpf do funcionario que procura");
                    String cpf_busca = sc.nextLine();
                     if (lista_funcionarios.containsKey(cpf_busca)) {
                        Funcionario funcionario = lista_funcionarios.get(cpf_busca);
                        System.out.println(funcionario);
                     } else {
                        System.out.println("Funcionario nao encontrado");
                         System.out.println("------------------");
                        opcao = 0;
                     }

                    break;



                case 3:
                    System.out.println("Digite o cpf do funcionario");
                    String cpf_remover = sc.nextLine();

                    if(!lista_funcionarios.containsKey(cpf_remover)) {
                        System.out.println("Funcionario nao encontrado");
                        System.out.println("------------------");
                        opcao = 0;
                    }

                    lista_funcionarios.remove(cpf_remover);
                    break;
                case 4:
                    for (Funcionario funcionario2 : lista_funcionarios.values()) {
                        System.out.println(funcionario2);
                    }
                    break;
                case 5:
                    System.out.println("Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opcao invalida");




            }
            }





    }

    public static void menu(){
        System.out.println("1- Cadastrar Funcionario");
        System.out.println("2- Buscar Funcionario");
        System.out.println("3- Remover Funcionario");
        System.out.println("4- Listar Funcionarios");
        System.out.println("5- Sair");
    }
}

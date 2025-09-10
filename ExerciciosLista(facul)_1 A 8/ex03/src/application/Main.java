package application;

import Model.entities.Carros;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        int opcao = 0;
        List<Carros> carros = new ArrayList<Carros>();
        int contador = 1;

        try {
            while (opcao != 6) {
                menu();
                opcao = s.nextInt();
                s.nextLine();

                switch (opcao) {
                    case 1:

                        System.out.println("Digite a marca do carro: ");
                        String marca = s.nextLine();

                        System.out.println("Digite o chassi: ");
                        String chassi = s.nextLine();

                        while (true){
                            if(chassi.length() != 6){
                                System.out.println("**** Erro: Digite um chassi com 6 caracteres.");

                                System.out.println("Digite o chassi: ");
                                chassi = s.nextLine();

                            } else {
                                break;
                            }
                        }



                        System.out.println("Digite o ano do carro: ");
                        int ano = s.nextInt();
                        s.nextLine();

                        Carros carro = new Carros(marca, contador, chassi.toCharArray(), ano);
                        carros.add(carro);
                        contador++;


                        break;

                    case 2:

                        System.out.println("*** Quantidade de carros cadastrados *** \n" + "---" + carros.size() + "---");

                        System.out.println("***********************");

                        break;

                    case 3:

                        System.out.println("*** Carros cadastrados ***");

                        for (Carros car: carros){
                            System.out.println(car.toString());
                        }

                        System.out.println("***********************");


                        break;
                    case 4:

                        System.out.println("Digite a chave do carro que deseja buscar: ");
                        int chave = s.nextInt();
                        s.nextLine();

                        boolean encontrado = false;

                        for (Carros car: carros){
                            if (car.getId() == chave) {
                                System.out.println(car.toString());
                                encontrado = true;
                                break;
                            }

                        } if (!encontrado){
                            System.out.println("Carro nao encontrado.");
                        }


                        break;

                    case 5:
                        System.out.println("Digite o id do carro que deseja remover: ");
                        int id = s.nextInt();
                        s.nextLine();

                        boolean removido = false;

                        for (Carros car: carros){
                            if (car.getId() == id){
                                carros.remove(car);
                                removido = true;
                                System.out.println("Carro removido com sucesso.");
                                break;
                            }
                        } if (!removido){
                            System.out.println("Carro nao encontrado.");
                        }


                        break;

                    case 6:

                        System.out.println("Saindoo...");

                        break;

                    default:
                        System.out.println("Digite uma opção válida.");


                }


            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira o tipo de dado correto.");
            s.nextLine(); // limpa o buffer
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            s.nextLine(); // limpa o buffer
        }



    }

    public static void menu() {
        System.out.println("******* MENU *******");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Quantidade de carros cadastrados: ");
        System.out.println("3 - Listar carros");
        System.out.println("4 - Buscar carro");
        System.out.println("5 - Remover carro");
        System.out.println("6 - Sair");
        System.out.println("*********************");
    }
}

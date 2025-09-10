import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4){
            menu();

            System.out.println("Digite a opção desejada: ");
            opcao = s.nextInt();


                switch (opcao){
                    case 1:
                        int senha = 0;

                            while (senha != 2002){
                                System.out.println("Digite a senha: ");
                                senha = s.nextInt();

                                if( senha != 2002){
                                    System.out.println("*** Erro-- Senha invalida \n***");
                                } else {
                                    System.out.println("*** Acesso concedido!!!");
                                }

                            }

                    break;

                    case 2:
                        while (true) {
                            int x = s.nextInt();
                            int y = s.nextInt();

                            // Encerra o programa se alguma das coordenadas for zero
                            if (x == 0 || y == 0) {
                                break;
                            }

                            if (x > 0 && y > 0) {
                                System.out.println("primeiro");
                            } else if (x < 0 && y > 0) {
                                System.out.println("segundo");
                            } else if (x < 0 && y < 0) {
                                System.out.println("terceiro");
                            } else if (x > 0 && y < 0) {
                                System.out.println("quarto");
                            }
                        }



                    break;

                    case 3:
                        int cod = 0;
                        int gaso = 0, alcool = 0, diesel = 0;
                        
                        while (cod != 4){
                            System.out.println("--- Digite o cod do seu combustivel favorito ---");
                            System.out.println("1 - Alcool");
                            System.out.println("2 - Gasolina");
                            System.out.println("3 - Diesel");
                            cod = s.nextInt();

                                switch (cod){
                                    case 1:
                                        alcool += 1;

                                    break;

                                    case 2:
                                        gaso += 1;

                                        break;

                                    case 3:
                                        diesel += 1;

                                        break;

                                    default:
                                        break;
                                }

                        }

                        System.out.println("MUITO OBRIGADO");
                        System.out.println("Alcool: " + alcool);
                        System.out.println("gasolina: " + gaso);
                        System.out.println("Diesel: " + diesel);

                        break;

                    case 4:
                        System.out.println("--- saindo ---");
                        break;







                    default:
                        System.out.println("Opção inválida");


                              }

                     }








        }


        public static void menu() {
            System.out.println(" ***Escolha qual exercicio quer testar ***");
            System.out.println("Ex 1");
            System.out.println("Ex 2");
            System.out.println("Ex 3");
            System.out.println("4 - Sair");
        }
}
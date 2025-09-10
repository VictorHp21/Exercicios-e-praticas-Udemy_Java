import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 8){
            menu();

            System.out.println("Digite qual a opção desejada: ");
            opcao = r.nextInt();

                switch (opcao){
                    case 1:
                        //ex01
                        int num;
                        System.out.println("digite um número inteiro");
                        num = r.nextInt();

                        if (num >= 0){
                            System.out.println("POSITIVO");
                        } else {
                            System.out.println("NEGATIVO");
                        }

                        break;

                    case 2:
                        //ex02
                        int num_parimpar;
                        System.out.println("digite um número inteiro");
                        num_parimpar = r.nextInt();

                        if (num_parimpar % 2 == 0){
                            System.out.println("PAR");
                        } else{
                            System.out.println("IMPAR");
                        }

                        break;


                    case 3:
                        //ex03
                        int nu1;
                        int nu2;

                        System.out.println("digite um número inteiro");
                            nu1 = r.nextInt();
                        System.out.println("digite outro número inteiro");
                            nu2 = r.nextInt();


                            if (nu1 % nu2 == 0 || nu2 % nu1 == 0){
                                System.out.println("Sao multiplos");
                            } else {
                                System.out.println("Nao soa multiplos");
                            }

                        break;


                    case 4:
                        //ex 04
                        int horain;
                        int horafin;

                        System.out.println("digite a hora de inicio do jogo");
                        horain = r.nextInt();
                        System.out.println("digite a hora de termino do jogo");
                        horafin = r.nextInt();


                        int duracao = horafin - horain;
                        int tempojogo = 24;

                            if (horafin > horain){
                                tempojogo = duracao;
                            } else {
                                tempojogo = tempojogo - horain + horafin;
                            }

                        System.out.println("O jogo durou " + tempojogo + " Hora(s)");


                        break;


                    case 5:
                        System.out.println("--- ESCOLHA UM DOS PRODUTOS ---");
                        System.out.println("1 - Cachorro quente - preço 4,00");
                        System.out.println("2 - X-salada - preço 4,50");
                        System.out.println("3 - X-bavon - preço 5,00");
                        System.out.println("4 - Torrada simples - preço 2,00");
                        System.out.println("5 - Refrigerante - preço 1,50");
                        int codigo = r.nextInt();
                        System.out.println("Quantas unidades deseja: ");
                        int unit = r.nextInt();

                        double valor = 0;
                            switch (codigo){
                                case 1:
                                     valor = 4.00 * unit;

                                    break;
                                case 2:
                                     valor = 4.50 * unit;

                                    break;
                                case 3:
                                     valor = 5.00 * unit;

                                    break;
                                case 4:
                                     valor = 2.00 * unit;

                                    break;
                                case 5:
                                     valor = 1.50 * unit;

                                    break;

                                default:
                                    System.out.println("opçao invalida***");
                            }

                        System.out.println("Total: " + valor);











                    case 8:
                        System.out.println("---- SAINDO ----");
                        break;

                    default:
                        System.out.println("Opção inválida");

                }
        }
    }

    public static void menu(){
        System.out.println(" ***Escolha qual exercicio quer testar ***");
        System.out.println("Ex 1");
        System.out.println("Ex 2");
        System.out.println("Ex 3");
        System.out.println("Ex 4");
        System.out.println("Ex 5");
        System.out.println("Ex 6");
        System.out.println("Ex 7");
        System.out.println("8 - Sair");

    }
}
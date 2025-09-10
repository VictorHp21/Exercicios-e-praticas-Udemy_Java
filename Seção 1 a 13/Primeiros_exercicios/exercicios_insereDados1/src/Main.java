import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner (System.in);

        int opcao = 0;



        while (opcao != 6){
            menu();

            System.out.println("Digite a opção desejada: ");
            opcao = r.nextInt();

            switch (opcao){
                case 1:
                    // ex 01
                    int x, y;

                    System.out.println("Digite o valor 1: ");
                    x = r.nextInt();
                    System.out.println("Digite o valor 2: ");
                    y = r.nextInt();

                    System.out.println("Soma dos valores é: " + (x + y));

                    break;

                case 2:
                    // ex 02
                    float raioC;

                    System.out.println("Digite o raio do quadrado: ");
                    raioC = r.nextFloat();

                    double areaC = 3.14159 * Math.pow(raioC,2);

                    System.out.printf("A area do circulo é: %.5f%n", areaC);

                    break;

                case 3:
                    // ex 03

                    int a, b ,c, d;

                    System.out.println("Digite quatro valores");
                    a = r.nextInt();

                    b = r.nextInt();

                    c = r.nextInt();

                    d = r.nextInt();

                    double diferenca = (a * b - c * d);

                    System.out.println("A diferença dos produtos é: " + diferenca);


                    break;

                case 4:
                    //ex 04
                    int num;
                    System.out.println("Digite o número do funcionário: ");
                    num = r.nextInt();

                    System.out.println("Digite o numero de horas trabalhadas: ");
                    int horas = r.nextInt();

                    System.out.println("Digite o valor por hora trabalhada: ");
                    float valor = r.nextFloat();

                        float salario = valor * horas;

                    System.out.println("O funcionário de numero " + num + " recebeu o sálario: $" + salario + " por ter trabalhado " + horas + " horas");



                    break;

                case 5:
                    //ex 05

                    System.out.println("Digite o codigo da peça 1: ");
                        int cod1 = r.nextInt();
                    System.out.println("Digite o numero de peças: ");
                        int num1 = r.nextInt();
                    System.out.println("Digite o valor de cada peça 1: ");
                        float valor1 = r.nextFloat();

                        float res1 = valor1 * num1;

                    System.out.println("Digite o codigo da peça 2: ");
                    int cod2 = r.nextInt();
                    System.out.println("Digite o numero de peças: ");
                    int num2 = r.nextInt();
                    System.out.println("Digite o valor de cada peça 2: ");
                    float valor2 = r.nextFloat();

                    float res2 = valor2 * num2;

                    float resultado_compra = res1 + res2;

                    System.out.printf("O valor da compra é: $ %.2f%n", resultado_compra);

                    break;


                case 6:
                    System.out.println("---- Saindo ----");
                    break;
                default:
                    System.out.println("*** Opção inválida ***");


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
        System.out.println("6 - Sair");

    }
}


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        // ex 01
       /* int x;
        System.out.println("Digite o valor de x: ");
        x = s.nextInt();

        for (int y = 1;  y < x; y++){
            if (y % 2 != 0){
                System.out.println(y);
            }
        } */

        // ex 02

           /* System.out.println("Digite quantos valores deseja ler:");
            int numv = s.nextInt();

            int dentro = 0;
            int fora = 0;

            for (int i = 1; i <= numv; i++){
                System.out.println("Digite um valor inteiro:");
                    int z = s.nextInt();
                        if (z >= 10 && z <= 20){
                            dentro++;
                } else{
                            fora++;
                        }
            }

            System.out.println(dentro + " in");
            System.out.println(fora + " out");
       */

        // ex03

        System.out.println("Digite quantos casos: ");
        int casos = s.nextInt();

        float a, b, c, mediap1 = 0, mediap2 = 0, mediap3 = 0;

            for (int i = 1; i <= casos; i++){
                System.out.println("Digite o primeiro valor: ");
                a = s.nextFloat();
                System.out.println("Digite o segundo valor: ");
                b = s.nextFloat();
                System.out.println("Digite o terceiro valor: ");
                c = s.nextFloat();

                switch (i){
                    case 1:
                         mediap1 = ((a * 2) +  (b * 3)  +  (c * 5)) / (2 + 3 +5);
                        break;
                    case 2:
                         mediap2 = ((a * 2) +  (b * 3)  +  (c * 5) )/ (2 + 3 +5);
                        break;
                    case 3:
                         mediap3 = ((a * 2) +  (b * 3)  +  (c * 5)) / (2 + 3 +5);
                        break;

                    default:
                        break;
                }


        }

            System.out.printf(" %.1f%n", mediap1);
            System.out.printf(" %.1f%n", mediap2);
            System.out.printf(" %.1f%n", mediap3);


    }
}
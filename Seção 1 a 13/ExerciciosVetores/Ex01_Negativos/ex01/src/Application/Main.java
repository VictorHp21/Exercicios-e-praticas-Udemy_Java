package Application;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


       boolean valor = false;

        while (!valor){
            System.out.println("Quantos números deseja digitar? ");
                int n = s.nextInt();
                int[] vetor = new int[n];
                    if(n <= 10 ) {
                        int num;
                        for (int i = 0; i < n; i++) {
                            System.out.println("Digite um número: ");
                            num = s.nextInt();
                            vetor[i] = num;
                        }

                        System.out.println("Números negativos: ");

                        for (int i = 0; i < n; i++) {
                            if (vetor[i] < 0) {
                                System.out.println(vetor[i]);
                            }
                            valor = true;
                        }


                    } else {
                        System.out.println("***ERRO*** -- Número deve ser menor que 10 --");

                    }






            }

            s.close();


        }



    }

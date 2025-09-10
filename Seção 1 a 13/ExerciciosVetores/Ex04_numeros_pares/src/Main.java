import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = s.nextInt();

        int[] vetor = new int[n];

            for (int i = 0; i < n; i++){
                System.out.println("Digite um numero: ");
                vetor[i] = s.nextInt();
            }

            System.out.println("Numeros pares: ");

            int quantPares = 0;
                for (int i = 0; i < vetor.length; i++){
                    if (vetor[i] % 2 == 0){
                        System.out.print(" " + vetor[i]);
                        quantPares ++;
                    }
                }

            System.out.println("\nQuantidade de Pares = " + quantPares);

    }
}
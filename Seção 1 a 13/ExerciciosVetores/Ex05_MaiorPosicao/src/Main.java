import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = s.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = s.nextDouble();
        }

        double maior = 0;
        int maiorPosicao = 0;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                maiorPosicao = i;
            }

        }

        System.out.printf("Maior valor = %.1f", maior);
        System.out.println("\nPosição maior valor = " + maiorPosicao);


    }
}
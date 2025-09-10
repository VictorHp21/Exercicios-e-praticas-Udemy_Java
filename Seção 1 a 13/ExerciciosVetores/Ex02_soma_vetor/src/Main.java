import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números voce vai digitar? ");
        int n = s.nextInt();

        double[] vetor = new double[n];

        double num;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            num = s.nextDouble();
            vetor[i] = num;
        }

        double  soma = 0;


        System.out.print("Valores = ");
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            System.out.printf("%.1f ", vetor[i]);
        }


        double media = soma / n;

        System.out.println("\nSoma = " + soma);
        System.out.println("Media = " + media);


        s.close();



    }
}
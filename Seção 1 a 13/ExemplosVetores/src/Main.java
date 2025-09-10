import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
            Scanner s = new Scanner(System.in);

            //exemplo 1

            /* int n = s.nextInt();

            double[] vetor = new double[n];

            double soma = 0;
            for (int i = 0; i<n; i++){
                vetor[i] = s.nextDouble();
                soma += vetor[i];
            }

            System.out.println("A media é " + soma/3); */


            //exemplo 2 com classe Produto

        int n = s.nextInt();

        Product[] vetorClasse = new Product[n];

        for (int i = 0; i < vetorClasse.length; i++){
            s.nextLine();
            String name = s.nextLine();
            double price = s.nextDouble();

            vetorClasse[i] = new Product(price, name);
        }

        double soma = 0;

        for (int i = 0; i<n; i++){
            soma+= vetorClasse[i].getPrice();
        }

        double media = soma / n;

        System.out.println("A média dos preços é: " + media);

        }
    }

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = s.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

            for(int i = 0; i < n; i++){
                System.out.println("Dados da " + (i+1) + "a pessoa: ");
                System.out.println("Nome: ");
                nomes[i] = s.next();
                System.out.println("Idade: ");
                idades[i] = s.nextInt();
                System.out.println("Altura: ");
                alturas[i] = s.nextDouble();
            }

        double alturaMedia = 0;
            for(int i = 0; i < alturas.length; i++){
                alturaMedia += alturas[i];
            }

            alturaMedia = alturaMedia / alturas.length;

            System.out.printf("Altura média: %.2f", alturaMedia);



            int numIdadesMenos16 = 0;
            for(int i = 0; i < idades.length; i++){
                if(idades[i] < 16){
                    numIdadesMenos16 ++;
                }

            }

            double percentualMenores = ((double)numIdadesMenos16 / n) * 100.0;

        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores);

            // Nomes pessoas com menos de 16
        for(int i = 0; i < idades.length; i++){
            if(idades[i] > 16){
                 System.out.println(nomes[i]);
            }

        }

        // pessoa mais velha

        int maioridade = 0;
        String maiorIdadeNome = "";
        for(int i = 0; i < idades.length; i++){
            if(idades[i] > maioridade){
                maioridade = idades[i];
                maiorIdadeNome = nomes[i];
            }

        }

        System.out.println("Pessoa mais velha: " + maiorIdadeNome);


    }
}
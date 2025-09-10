import java.util.Locale;

public class Main {

    public static void main(String[] args){

        // testes simples de saída de dados

        System.out.println("Olá, Mundo!");

        System.out.println("Buenos dias");

        int x = 5;

        System.out.println("o valor de x é:" + x);

        int y = 32;

        System.out.println(y);

        double p = 1.2563;
        // printf para valores FORMATADOS
        System.out.printf("%.2f%n", p);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", p);

        System.out.printf("Altura: %.2f metros%n", p);

    }

}

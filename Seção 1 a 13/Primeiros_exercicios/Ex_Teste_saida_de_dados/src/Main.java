import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        String produto1 = "Computer";
        String produto2=  "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products: \n" + produto1 + ", which price is $ " + price1);
        System.out.println(produto2 + ", which price is $ " + price2);

        System.out.println("\nRecord: " + age + "old, code " + code + "and gender: " + gender);

        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("three decimal %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

        System.out.println("Digite sua idade: ");
        int idade = texto.nextInt();
        System.out.println("Sua idade é: " + idade);

        char x;

        System.out.println("Digite um caracter: ");
        x = texto.next().charAt(0);
        System.out.println("O caracter digitado foi: " + x);

        // para ler vários dados na mesma linha

        String y;
        int w;
        double z;

        y = texto.next();
        w = texto.nextInt();
        z = texto.nextDouble();

    System.out.println(y + " "  + w + " " + z);



    }
}
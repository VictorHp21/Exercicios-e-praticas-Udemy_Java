import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        double x, y, media;

        System.out.println("Digite o primeiro número: ");
        x = texto.nextDouble();
        System.out.println("Digite o segundo número");
        y = texto.nextDouble();

        media = (x + y) / 2;

        System.out.println("A média dos números é: " + media);
        texto.close();
    }
}

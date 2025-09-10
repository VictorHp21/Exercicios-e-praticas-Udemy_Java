package Application;

import Util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarprice = s.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double dollarbought = s.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.calc(dollarprice, dollarbought));



    }
}

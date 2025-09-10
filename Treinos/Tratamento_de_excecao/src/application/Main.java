package application;


import Model.entities.contaCorrente;
import Model.entities.contaPoupanca;
import Model.exceptions.InvalidValueException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        contaCorrente cc = new contaCorrente(123, "Joao", 1000.00);
        contaPoupanca cp = new contaPoupanca(456, "Maria", 500.00);

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com o valor do saque na conta corrente: ");
            double valor = sc.nextDouble();
            cc.sacar(valor);
            System.out.println("Entre com o valor para depósito na conta corrente: ");
            valor = sc.nextDouble();
            cc.depositar(valor);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Entre com o valor do saque na conta poupanca: ");
            double valor = sc.nextDouble();
            cp.sacar(valor);
            System.out.println("Entre com o valor para depósito na conta poupanca: ");
            valor = sc.nextDouble();
            cp.depositar(valor);
        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Valor da conta corrente: " + cc.getSaldo());
        System.out.println("Valor da conta poupança: " + cp.getSaldo());


    }
}

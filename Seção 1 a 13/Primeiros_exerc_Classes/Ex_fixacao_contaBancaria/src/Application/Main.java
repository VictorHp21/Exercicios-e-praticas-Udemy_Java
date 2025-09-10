package Application;

import Entities.Conta_Bancaria;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numeroConta = s.nextInt();
        s.nextLine();

        System.out.println("Enter account holder: ");
        String nome = s.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char opcao = s.next().charAt(0);

        double depositoInicial;
            if(opcao == 'y'){
                System.out.println("Value initial deposit: ");
                 depositoInicial = s.nextDouble();
            } else {
                depositoInicial = 0.0;
            }
        Conta_Bancaria conta1 = new Conta_Bancaria(numeroConta, nome, depositoInicial);


        System.out.println("Account data:");
        conta1.dadosConta();

        System.out.println("Enter a deposit value: ");
        double valordeposito = s.nextDouble();
        conta1.deposito(valordeposito);

        System.out.println("Updated Account data:");
        conta1.dadosConta();

        System.out.println("Enter a withdraw value: ");
        double valorSaque = s.nextDouble();
        conta1.saque(valorSaque);

        System.out.println("Updated Account data:");
        conta1.dadosConta();




    }
}
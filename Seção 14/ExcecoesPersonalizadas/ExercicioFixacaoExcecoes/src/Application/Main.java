package Application;

import Model.Entities.Account;
import Model.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DomainException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Enter the account data ***: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        double withDrawLimit = sc.nextDouble();

        Account conta = new Account(number, holder, balance, withDrawLimit);

        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        try {
            conta.withdraw(amount);
            System.out.println("New balance: " + conta.getBalance());
        } catch (DomainException e){
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }




    }
}

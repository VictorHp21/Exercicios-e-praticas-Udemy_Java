import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final NumberFormat REAL =
            NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        // Account acc1 = new Account("Alex",1001,  1000.0); -- da erro pois a classe Account é abstrata
        Account acc2 = new SavingsAccount("Maria", 1002, 1000.0, 0.01);
        Account acc3 = new BusinessAccount("Bob", 1003, 1000.0, 500.0);



        List<Account> contas = new ArrayList<>();

        contas.add(new SavingsAccount("Alex", 1001, 1000.0, 0.01));
        contas.add(new BusinessAccount("Maria", 1002, 2560.0, 500.0));
        contas.add(new SavingsAccount("Bob", 1003, 4560.0, 0.01));
        contas.add(new BusinessAccount("Anna", 1004, 5000.0, 500.0));


          /* Totalizar o saldo de todas as contas.
                Depositar10 .00e mtodasascontas */

        double sum = 0.0;

        for (Account acc: contas){
            acc.deposit(10.0);
            sum += acc.getBalance();
        }

        System.out.printf("Total balance:  %.2f%n", sum);

        for (Account acc: contas){
            System.out.println("Saldo da conta " + acc.getNumber() + ": " + REAL.format(acc.getBalance()));
        }





    }
}
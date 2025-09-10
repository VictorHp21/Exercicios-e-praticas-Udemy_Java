import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {
       // upcasting e downcasting

        Account acc = new Account("Alex", 1001, 0.0);
        BusinessAccount bacc = new BusinessAccount("Maria", 1002, 0.0, 500.0);

         // UPCASTING (atribuindo um objeto de uma subclasse para uma superclasse)

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount("Bob", 1003, 0.0, 200.0);
        Account acc3 = new SavingsAccount("Felipe", 2007, 0.600, 0.01);

        // DOWNCASTING (corverter um objeto de uma superclasse para uma subclasse)

        BusinessAccount acc4 = (BusinessAccount) acc2; // casting manual
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3; // erro de casting

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan ok!");
        } else{
            System.out.println("Loan error!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update ok!");
        } else {
            System.out.println("Update error!");
        }

// com sobreposição
        Account conta1 =   new Account("Alex", 1001, 1000.0);
        conta1.withdraw(200.0);
        System.out.println(conta1.getBalance());

        Account conta2 = new SavingsAccount("Maria", 1002, 1000.0, 0.01);
        conta2.withdraw(200.00);
        System.out.println(conta2.getBalance());

        Account conta3 = new BusinessAccount("Bob", 1003, 1000.0, 500.0);
        conta3.withdraw(200.0);
        System.out.println(conta3.getBalance());

    // com polimorfismo
        Account x = new Account("Alex",1020, 1000.0);
        Account y = new SavingsAccount("Maria",1023, 1000.0,0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}

package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        int Number = sc.nextInt();
        sc.nextLine();
        System.out.println("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter number of installments: ");
        int months = sc.nextInt();

        Contract contract = new Contract(Number, date, totalValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Installments: ");
        for (Installment parcelas: contract.getInstallment()){
            System.out.println(parcelas.getDueDate() + " - " + parcelas.getAmount());
        }


    }
}

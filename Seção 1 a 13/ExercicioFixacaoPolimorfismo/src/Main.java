import Entities.Product;
import Entities.importedProduct;
import Entities.usedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        // inserindo lista para objetos diferentes
        ArrayList<Product> produtos = new ArrayList<>();

        //ArrayList<OutsourceEmployee> funcionariosTercerizados = new ArrayList<>();//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


        System.out.println("Entre com o número de produtos: ");
        int n = s.nextInt();

        String nome;
        double price, customsFee;

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data;

        //LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);


        for (int i = 1; i <= n; i++) {
            s.nextLine();
            System.out.println("Produto #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)? ");
            char ch = s.next().charAt(0);
            if (ch == 'c') {
                s.nextLine();
                System.out.println("Nome: ");
                nome = s.next();
                System.out.println("Preço: ");
                price = s.nextDouble();
                produtos.add(new Product(nome, price));
            } else if (ch == 'u') {
                s.nextLine();
                System.out.println("Nome: ");
                nome = s.next();
                System.out.println("Preço: ");
                price = s.nextDouble();
                System.out.println("Data de fabricação: ");
                data = LocalDate.parse(s.next(), fmt1);
                produtos.add(new usedProduct(nome, price, data));
            } else {
                s.nextLine();
                System.out.println("Nome: ");
                nome = s.next();
                System.out.println("Preço: ");
                price = s.nextDouble();
                System.out.println("Taxa de importação: ");
                customsFee = s.nextDouble();
                produtos.add(new importedProduct(nome, price, customsFee));
            }
        }

        System.out.println("Pagamentos:");

        for (Product produ : produtos) {
            System.out.println(produ.priceTag());
        }

        s.close();

    }
}


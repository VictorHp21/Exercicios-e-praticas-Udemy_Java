package Application;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.println("Name: ");
        String namec = s.nextLine();

        System.out.println("E-mail: ");
        String email = s.nextLine();

        System.out.println("Birth date: ");
        Date birthDate = sdf.parse(s.next());

        Client cliente = new Client(namec, email, birthDate);




        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(s.next());


        Order pedidos = new Order(new Date(), status, cliente);



        System.out.println("How many items to this order?");
        int opc = s.nextInt();

            for(int i = 0; i < opc; i++){
                System.out.println("Enter #" + (i + 1) + " item data: ");
                System.out.println("Product Name: ");
                    s.nextLine();
                String productName = s.nextLine();

                System.out.println("Product Price: ");
                Double price = s.nextDouble();

                Product produto = new Product(price, productName);

                System.out.println("Quantity: ");
                int quatidade = s.nextInt();


                OrderItem ordem = new OrderItem(quatidade, price, produto);

                pedidos.addItem(ordem);
            }


        System.out.println();
        System.out.println("ORDER SUNNARY: ");
        System.out.println(pedidos);


        s.close();


    }
}

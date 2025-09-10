package application;

import Entities.Order;
import Entities.enums.OrderStatus;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);


        // coversão de String para enum

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);

        System.out.println("------------");

        System.out.println(os2);


        // notação UML

        OrderStatus os3 = OrderStatus.valueOf("PENDING_PAYMENT");
        System.out.println(os3);



    }
}
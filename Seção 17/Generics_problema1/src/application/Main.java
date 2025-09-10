package application;

import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// colocar o <> para indicar que esta instanciando um generics
       // PrintService<Integer> ps = new PrintService<>();

        PrintService<String> ps = new PrintService<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();



        for(int i = 0; i < n; i++) {
           // Integer value = sc.nextInt();
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();

        //Integer x = ps.first();
        String x = ps.first();

        System.out.println("First: " + x);

        sc.close();




    }
}

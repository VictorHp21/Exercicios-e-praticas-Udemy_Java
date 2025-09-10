package Application;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Locale.setDefault(Locale.US);

        System.out.println("Enter rectangle width and height: ");
        double w = s.nextDouble();
        double h = s.nextDouble();

       Rectangle x;
       x = new Rectangle();
       x.height = h;
       x.width = w;

        System.out.println("AREA = " + x.area());
        System.out.println("PERIMETER = " + x.perimeter());
        System.out.println("DIAGONAL = " + x.diagonal());







    }
}

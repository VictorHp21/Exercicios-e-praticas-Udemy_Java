import Entities.Retangle;
import Entities.Shape;
import Entities.Circle;
import Entities.enums.Colors;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        List<Shape> formas = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = s.next().charAt(0);

            s.nextLine();

            System.out.println("Color (BLACK/WHITE/RED/GREEN/BLUE)? ");
            Colors color = Colors.valueOf(s.next());

            if (ch == 'r') {
                System.out.println("Width: ");
                Double width = s.nextDouble();
                System.out.println("Height: ");
                Double Height = s.nextDouble();

                formas.add(new Retangle(color, width, Height));

            } else if (ch == 'c') {
                System.out.println("Radius: ");
                Double radius = s.nextDouble();

                formas.add(new Circle(color, radius));
            } else{
                System.out.println("Invalid data!");
            }


        }

        System.out.println("Shapes areas: ");

        for(Shape shp: formas){
            System.out.println(String.format("%.2f", shp.area()));
        }

        s.close();

    }
}
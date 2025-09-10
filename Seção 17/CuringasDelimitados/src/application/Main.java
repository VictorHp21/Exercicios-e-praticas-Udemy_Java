package application;

import entitites.Circle;
import entitites.Rectangle;
import entitites.Shape;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));


        System.out.println("Total area:" + totalArea(myCircles));
    }
    // lista pode ser de shape ou de qualquer tipo que herde de shape
    public static double totalArea(List<? extends Shape> list) {
        // list.add(new Rectangle(3.0, 4.0)); // não compila (n é possivek adcionar elementos na lista)
        double total = 0;
        for (Shape s : list) {
            total += s.area();
        }
        return total;
    }
}

package application;

import Model.entities.AbstractShape;
import Model.entities.Circle;
import Model.entities.Rectangle;
import Model.entities.Shape;
import Model.enums.Color;

public class Main {
    public static void main(String[] args) {
        AbstractShape s1  = new Circle(Color.BLUE, 2.0);
        AbstractShape s2  = new Rectangle(Color.RED, 3.0, 4.0);


        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));





    }
}

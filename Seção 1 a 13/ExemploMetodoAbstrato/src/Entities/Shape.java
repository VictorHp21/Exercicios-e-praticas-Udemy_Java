package Entities;

import Entities.enums.Colors;

public abstract class Shape {
    private Colors color;

    public Shape(){}

    public Shape(Colors color) {
        this.color = color;
    }


    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    // metodo abstrato

    public abstract double area();
}

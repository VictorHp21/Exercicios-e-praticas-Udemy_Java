package entities;

import java.util.Objects;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // metodo estatico // outra forma de implementar o predicato
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    } // metodo estatico trabalha com o produto passado como argumento

    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    } // metodo nao estatico trabalha com o proprio objeto




    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

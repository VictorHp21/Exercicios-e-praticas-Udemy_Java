package entities;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Product /* implements Comparable<Product>*/{
    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nome, product.nome) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, price);
    }


    //compareTo
     /* @Override
    public int compareTo(Product p) {
        return nome.toUpperCase().compareTo(p.getNome().toUpperCase());
    } */


}

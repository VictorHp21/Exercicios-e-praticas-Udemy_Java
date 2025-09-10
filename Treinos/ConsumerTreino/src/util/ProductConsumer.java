package util;

import entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product p) {
        p.setPrice  (p.getPrice() - p.getPrice() * 0.1);
    }
}

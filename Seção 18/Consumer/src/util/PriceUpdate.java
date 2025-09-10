package util;

import entities.Product;

import java.util.function.Consumer;

// implementação da Interface Consumer

public class PriceUpdate implements Consumer<Product> {

    // consumer que ira aumentar o preço em 10%
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}

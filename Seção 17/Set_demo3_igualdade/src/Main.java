import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        // comparando pelo ponteiro
        System.out.println(set.contains(prod));

        // comparando pelo conteúdo para retornar true
        // basta adicionar os metodos equals e hashCode na classe Product

    }
}

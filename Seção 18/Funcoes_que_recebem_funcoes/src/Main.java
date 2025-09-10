import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("Tv", 900.00));
        lista.add(new Product("Notebook", 1200.00));
        lista.add(new Product("Tablet", 450.00));
        lista.add(new Product("HD case", 80.90));
        lista.add(new Product("Mouse", 50.00));

        /* Fazer um programa que, a partir de uma lista de produtos,
        calcule a soma dos preços somente dos produtos cujo nome começa
        com "T".
        */

        ProductService ps = new ProductService();

        //
        double sum = ps.filteredSum(lista, p -> p.getName().charAt(0) == 'T');

        double sum2 = ps.filteredSum(lista, p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum: " + ("$") +  String.format("%.2f", sum) );

        System.out.println("Sum2: " + ("$") +  String.format("%.2f", sum2) );

        double sum3 = ps.filteredSum(lista, p -> p.getPrice() < 100.0);

        System.out.println("Sum3: " + ("$") +  String.format("%.2f", sum3) );



    }
}

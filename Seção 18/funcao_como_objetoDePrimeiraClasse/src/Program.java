import java.util.ArrayList;
import java.util.List;

public class Program {
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // uma função dentro de uma funcao
        // função de primeira classe ou ordem
        list.sort(Program::compareProducts);
        // comun na programacao funcional


                  // ou uma expressao lambda:
                    //inferencia de tipos ("inferece que são objetos do tipo Product")
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));




        list.forEach(System.out::println);



        // outro exemplo agora de expressividade e codigo conciso

        Integer sum = 0;
        for (Integer x: list){
            sum += x;
        }

        // VS

        Integer sum1 = list.stream().reduce(0, Integer::sum1);



    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  // n aceita tipos primitivos por isso uso de wrapper class = Integer

        List<Integer> List = new ArrayList<>();

        List.add(22);
        List.add(23);
        List.add(78);
        List.add(32);
        List.add(62);
        List.add(52);
        List.add(48);
        List.add(58);

        List.add(2, 56); // para adc no indice 2 por exemplo

        // para remover pelo indice
        List.remove(1);

        // para remover pelo valor integer
        List.remove(Integer.valueOf(48));

        // para remover elementos que atendam um PREDICADO
        List.removeIf(x -> x < 50);

        /* Se fosse uma lista de String e eu quisesse REMOVER os nomes que iniciam com M
        *
        List.removeIf(x -> x.charAt(0) == 'M');
        *
        *  */


        for (Integer x : List){
            System.out.println(x);
        }

        System.out.println("Tamanho da Lista: " + List.size());


        // p encontrar a posição de um elemento

        System.out.println("Index of 58: " + List.indexOf(58));

        // p mostrar apenas alguns especificos

        List<Integer> result = List.stream().filter(x -> x > 58).collect(Collectors.toList());

        for (Integer y : result){
            System.out.println(y);
        }


        // para encontrar o primeiro elemento que atenda um requisito

        Integer primeiro = List.stream().filter(x -> x > 58).findFirst().orElse(null);

        System.out.println("Primeiro elemento na lista (por indice) maior que 58: " + primeiro);

    }
}
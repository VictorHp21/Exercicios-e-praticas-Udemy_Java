/* Com tipos curinga podemos fazer métodos
        que recebem um genérico de "qualquer tipo" */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        System.out.println("-------------------");

        List<String> myStrings = Arrays.asList("a", "b", "c");
        printList(myStrings);





        /* Porém não é possível adicionar dados a uma
        coleção de tipo curinga */

       /* List<?> list = new ArrayList<Integer>();
        list.add(3); // erro de compilação  */


    }
                             // tipo curinga => List<?>
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

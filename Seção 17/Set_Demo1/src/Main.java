import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // HashSet Muito rapido mas não garante a ordem
        //Set<String> set = new HashSet<>();

        // ordena os dados (neste exemplo em ordem alfabetica)
        //Set<String> set = new TreeSet<>();

        // manten a ordem de inserção
        Set<String> set = new LinkedHashSet<>();

        set.add("Arco");
        set.add("Carro");
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));


        set.remove("Tablet");

        // set.removeIf(x -> x.length() >= 3);
        // x -> (tal que) alguma coisa  (predicados)
        set.removeIf(x ->x.charAt(0) == 'T');

        System.out.println("---");

        for (String p : set) {
            System.out.println(p);
        }



    }
}

package service;

import java.util.List;

public class CalculationService {
// T representa um tipo genérico

    // metodo generico
                                    // tipo comparavel T ou qualquer superclasse de T
    public static <T extends Comparable<? super T>> T max (List<T> list){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        T max = list.get(0);
        for (T item: list){
            // se a comparação for maior que 0, o item é maior
            //Cannot resolve method 'compareTo' in 'T'

            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }









    // metodo para integer (encontra o maior)
   /* public static Integer max(List<Integer> list){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        Integer max = list.get(0);
        for (Integer item: list){
            // se a comparação for maior que 0, o item é maior
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    } */

}

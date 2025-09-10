package services;

import java.util.ArrayList;
import java.util.List;

// classe generica
// solução generics
//este T seria para tipo mas pode ser usando outro nome
public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        } else {
            System.out.println(list);
        }

    }



}

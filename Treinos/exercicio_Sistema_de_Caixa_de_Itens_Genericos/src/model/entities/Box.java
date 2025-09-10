package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public Box<T> addLista(List<T> items) {
        this.items.addAll(items);
        return this;
    }

    public List<T> getItems() {
        return items;
    }

    public T get(int index) {
        return items.get(index);
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}

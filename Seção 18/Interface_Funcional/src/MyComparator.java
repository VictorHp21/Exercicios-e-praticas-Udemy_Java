// INTERFACE FUNCIONAL
// É uma interface que tem apenas um método abstrato


// no fundo a expressão lambda sera tratada como uma interface funcional //


import java.util.Comparator;


public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

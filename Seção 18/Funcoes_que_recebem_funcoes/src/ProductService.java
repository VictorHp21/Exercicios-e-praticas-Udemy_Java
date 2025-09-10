import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    // fazendo um teste generico de qualquer predicado              // criterio poderia ser t ou outra letra
    public double filteredSum(List<Product> list, Predicate<Product> criterio){
        double sum = 0.0;
        for(Product p : list){
            if(criterio.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

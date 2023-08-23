package App2;

import java.util.ArrayList;
import java.util.List;

import App2.entities.Product;

// Exemplo Predicate (interface funcional)
public class App {
    public static void main(String[] args) throws Exception {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.00));

        // list.removeIf(p -> p.getPrice() >= 100);
        // list.removeIf(Product::staticProductPredicate); // reference method com
        // método estático
        list.removeIf(Product::nonStaticProductPredicate); // reference method com método não estático

        for (Product product : list) {
            System.out.println(product);
        }
    }
}

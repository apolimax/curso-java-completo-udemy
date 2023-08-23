package App3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import App3.entities.Product;

// Exemplo Consumer (interface funcional)
public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.00));

        // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

        // list.forEach(new PriceUpdate());
        // list.forEach(Product::staticPriceUpdate); // reference method static method
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        // list.forEach(cons);

        list.forEach(System.out::println);
    }
}

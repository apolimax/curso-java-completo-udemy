package App3;

import java.util.HashMap;
import java.util.Map;

import App3.entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.00);
        Product p2 = new Product("Notebook", 1200.00);
        Product p3 = new Product("Tablet", 400.00);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 1500.0);

        Product ps = new Product("TV", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}

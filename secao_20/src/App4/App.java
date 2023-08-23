package App4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import App4.entities.Product;

// Exemplo Function (interface funcional)
public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.00));

        /*
         * Function<Product, String> func = p -> p.getName().toUpperCase();
         * 
         * List<String> names = list.stream().map(func).collect(Collectors.toList());
         */
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}

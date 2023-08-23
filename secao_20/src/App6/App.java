package App6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import App6.entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "src/App6/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> products = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Double avg = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / products.size();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            System.out.println("Average price: " + String.format("%.2f", avg));
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

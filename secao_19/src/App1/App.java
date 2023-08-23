package App1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import App1.entities.Product;
import App1.services.CalculationService;

// Classe principal para o exercício de Genéricos Delimitados
public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();

        Locale.setDefault(Locale.US);

        String path = "src/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: " + x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

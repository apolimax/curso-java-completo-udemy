import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class App2 {

    public static void main(String[] args) {
        String path = "src/file2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Integer[] numbers = new Integer[8];
            String line = br.readLine();
            int i = 0;

            while (line != null) {
                numbers[i] = Integer.parseInt(line);
                line = br.readLine();
                i++;
            }

            Arrays.sort(numbers);

            for (Integer number : numbers) {
                System.out.println(number);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

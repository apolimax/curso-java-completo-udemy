
//import java.io.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        // usando a classe File
        /*
         * File file = new File("src/file.txt");
         * Scanner sc = null;
         * 
         * try {
         * sc = new Scanner(file);
         * while (sc.hasNextLine()) {
         * System.out.println(sc.nextLine());
         * }
         * 
         * } catch (IOException e) {
         * System.out.println("Error: " + e.getMessage());
         * } finally {
         * if (sc != null) {
         * sc.close();
         * }
         * }
         */
        // usando as classes BufferedReader e FileReader
        /*
         * String path = "src/file.txt";
         * 
         * try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         * String line = br.readLine();
         * 
         * while (line != null) {
         * System.out.println(line);
         * line = br.readLine();
         * }
         * } catch (Exception e) {
         * System.out.println("Error: " + e.getMessage());
         * }
         */
        // criando um arquivo com as classes BufferedWriter e FileWriter
        String[] lines = new String[] { "Bonjour", "Bonne nuit" };

        String path = "src/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

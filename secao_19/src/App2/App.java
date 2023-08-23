package App2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import App2.entities.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "src/App2/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Set<LogEntry> set = new HashSet<>();
            Map<Integer, LogEntry> map = new HashMap<>();

            String line = br.readLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            int count = 0;
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                LocalDate moment = LocalDate.parse(fields[1], formatter);

                map.put(count, new LogEntry(username, moment));
                // set.add(new LogEntry(username, moment));

                count++;
                line = br.readLine();
            }

            System.out.println("Total users: " + map.size());
            // System.out.println("Total users: " + set.size());

            for (Integer key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }
            /*
             * for (LogEntry entry : set) {
             * System.out.println(entry);
             * }
             */
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

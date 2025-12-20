import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class FileAnalyzer {
    public static void main(String[] args) {

        String longest = "";
        String shortest = null;
        HashSet<String> uniqueWords = new HashSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                // Split words
                String words[] = line.toLowerCase().trim().split("\\s+");

                for (String w : words) {

                    // Ignore empty strings
                    if (w.isEmpty()) continue;

                    // Add to set for unique words
                    uniqueWords.add(w);

                    // Longest word
                    if (w.length() > longest.length()) {
                        longest = w;
                    }

                    // Shortest word
                    if (shortest == null || w.length() < shortest.length()) {
                        shortest = w;
                    }
                }
            }

            br.close();

            System.out.println("Longest Word: " + longest);
            System.out.println("Shortest Word: " + shortest);
            System.out.println("Unique Words: " + uniqueWords.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
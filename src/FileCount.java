import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCount {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (including spaces)
                charCount += line.length();

                // Count words
                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
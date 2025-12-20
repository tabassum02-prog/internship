import java.io.FileReader;
import java.io.IOException;

public class ReadCharacters {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextFile {
    public static void main(String[] args) {

        try {
            // Create FileWriter object
            FileWriter fw = new FileWriter("sample.txt");

            // Writing 10–15 lines into the file
            fw.write("1. This is a sample line.\n");
            fw.write("2. Learning Java file handling.\n");
            fw.write("3. This file contains multiple lines.\n");
            fw.write("4. Git is a popular version control system.\n");
            fw.write("5. Joomla is a CMS for building websites.\n");
            fw.write("6. IIT Bombay Spoken Tutorials are helpful.\n");
            fw.write("7. File handling is easy in Java.\n");
            fw.write("8. Writing text using FileWriter.\n");
            fw.write("9. Each line ends with a newline.\n");
            fw.write("10. This is the tenth sample line.\n");
            fw.write("11. Java programs run on JVM.\n");
            fw.write("12. Practice makes you perfect.\n");
            fw.write("13. This is another example line.\n");
            fw.write("14. Students use text files in assignments.\n");
            fw.write("15. End of sample.txt content.\n");

            fw.close();
            System.out.println("sample.txt created successfully!");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
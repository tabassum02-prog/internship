import java.io.*;
import java.util.*;

public class SimpleLogger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String msg = sc.nextLine();

        FileWriter fw = new FileWriter("log.txt", true); // append mode
        fw.write(msg + "\n"); // write + newline
        fw.close();

        System.out.println("Message saved to log.txt");
    }
}
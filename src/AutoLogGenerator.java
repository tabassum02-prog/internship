import java.io.*;
import java.time.*;

public class AutoLogGenerator {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));

        // 25 INFO
        for (int i = 1; i <= 25; i++) {
            bw.write(LocalDateTime.now() + " INFO Log number " + i);
            bw.newLine();
        }

        // 15 WARN
        for (int i = 1; i <= 15; i++) {
            bw.write(LocalDateTime.now() + " WARN Warning message " + i);
            bw.newLine();
        }

        // 10 ERROR
        for (int i = 1; i <= 10; i++) {
            bw.write(LocalDateTime.now() + " ERROR Error message " + i);
            bw.newLine();
        }

        bw.close();
        System.out.println("50 logs generated.");
    }
}
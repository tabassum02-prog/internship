import java.io.*;
import java.time.*;

public class TimestampLogger {
    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));

        String message = "Application Started"; // example
        bw.write(LocalDateTime.now() + " INFO " + message);
        bw.newLine();

        bw.close();
        System.out.println("Timestamp log written.");
    }
}
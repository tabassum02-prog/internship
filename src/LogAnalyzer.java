import java.io.*;

public class LogAnalyzer {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("log.txt"));

        String line;
        int total = 0, info = 0, warn = 0, error = 0;
        String longest = "";
        String firstTimestamp = null;
        String lastTimestamp = null;

        while ((line = br.readLine()) != null) {
            total++;

            if (line.contains("INFO")) info++;
            if (line.contains("WARN")) warn++;
            if (line.contains("ERROR")) error++;

            // Check longest
            if (line.length() > longest.length()) {
                longest = line;
            }

            // Timestamp: everything before INFO/WARN/ERROR
            String timestamp = line.split(" INFO| WARN| ERROR")[0];

            if (firstTimestamp == null) {
                firstTimestamp = timestamp;
            }
            lastTimestamp = timestamp;
        }

        br.close();

        System.out.println("Total Log Lines: " + total);
        System.out.println("INFO Count: " + info);
        System.out.println("WARN Count: " + warn);
        System.out.println("ERROR Count: " + error);
        System.out.println("Longest Log Line: " + longest);
        System.out.println("First Timestamp: " + firstTimestamp);
        System.out.println("Last Timestamp: " + lastTimestamp);
    }
}
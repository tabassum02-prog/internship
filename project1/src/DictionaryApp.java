import java.util.*;

public class DictionaryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        // Taking 5 words
        System.out.println("Enter 5 English words and their meanings:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter word " + i + ": ");
            String word = sc.nextLine();

            System.out.print("Enter meaning of " + word + ": ");
            String meaning = sc.nextLine();

            dictionary.put(word, meaning);
        }

        //  Searching
        System.out.print("\nEnter a word to search its meaning: ");
        String searchWord = sc.nextLine();

        if (dictionary.containsKey(searchWord)) {
            System.out.println("Meaning: " + dictionary.get(searchWord));
        } else {
            System.out.println("Word not found in the dictionary");
        }

        sc.close();
    }
}
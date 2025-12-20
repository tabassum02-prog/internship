import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);

        System.out.println("Fail-Safe Example:");

        for (Integer n : numbers) {
            System.out.println(n);

            // Modifying list during iteration (NO ERROR)
            numbers.add(3);
        }

        System.out.println("\nFinal List: " + numbers);
    }
}
import java.util.*;

public class FailFast {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Get Iterator
        Iterator<String> itr = list.iterator();

        System.out.println("Fail-Fast Example:");

        try {
            while (itr.hasNext()) {
                System.out.println(itr.next());

                // INTENTIONALLY modify list while iterating
                list.add("new");
            }
        }
        catch (ConcurrentModificationException e) {
            System.out.println("\n⚠️ ConcurrentModificationException Occurred!");
        }
    }
}
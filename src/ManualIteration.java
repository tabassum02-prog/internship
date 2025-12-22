import java.util.*;

public class ManualIteration {
    public static void main(String[] args) {

        // Create a list
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Dates");
        list.add("Elderberry");


        // 1. Iterate using Iterator

        System.out.println("1️⃣ Using Iterator:");
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Iterate using For-each loop

        System.out.println("\n2️⃣ Using For-each Loop:");
        for (String item : list) {
            System.out.println(item);
        }

        // 3. Iterate using ListIterator (Reverse)

        System.out.println("\n3️⃣ Using ListIterator (Reverse Traversal):");

        ListIterator<String> itr = list.listIterator(list.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
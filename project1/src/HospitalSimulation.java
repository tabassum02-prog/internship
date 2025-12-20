import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class HospitalSimulation {
    public static void main(String[] args) {

        // Fail-Fast List → Doctor list currently being processed
        ArrayList<String> doctorList = new ArrayList<>();
        doctorList.add("Dr. A");
        doctorList.add("Dr. B");
        doctorList.add("Dr. C");

        // Fail-Safe List → Emergency updates from reception
        CopyOnWriteArrayList<String> emergencyQueue = new CopyOnWriteArrayList<>();
        emergencyQueue.add("Patient-1");
        emergencyQueue.add("Patient-2");

        System.out.println("Fail-Fast Doctor List Processing:");
        try {
            for (String doc : doctorList) {
                System.out.println("Processing: " + doc);

                // Live update causes fail-fast error
                doctorList.add("Dr. Emergency");
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("⚠️ Fail-Fast Triggered! Doctor list modified during processing.\n");
        }

        System.out.println("Fail-Safe Emergency Queue Processing:");
        for (String p : emergencyQueue) {
            System.out.println("Handling: " + p);

            // Live update allowed (fail-safe)
            emergencyQueue.add("New-Emergency");
        }

        System.out.println("\nFinal Emergency Queue: " + emergencyQueue);
    }
}




//Explanation
//| Feature               | **Fail-Fast**                                            | **Fail-Safe**                               |
//| --------------------- | -------------------------------------------------------- | ------------------------------------------- |
//| **Meaning**           | Fails immediately if collection changes during iteration | Safe to modify collection while iterating   |
//| **Throws Exception?** | Yes → `ConcurrentModificationException`                  | No exceptions                               |
//| **Works On**          | Original collection                                      | Copy of the collection (snapshot)           |
//| **Examples**          | `ArrayList`, `HashMap`, `HashSet`                        | `CopyOnWriteArrayList`, `ConcurrentHashMap` |
//| **Speed**             | Faster (no extra copying)                                | Slower (creates copies)                     |
//| **When Used?**        | When data must remain stable                             | When live updates are needed                |
//| **Real Example**      | Doctor list (fixed schedule)                             | Emergency patient updates (keeps changing)  |
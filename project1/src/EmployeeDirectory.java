import java.util.*;

public class EmployeeDirectory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        TreeMap<Integer, String> employees = new TreeMap<>();

        System.out.println("Enter details of 5 employees (ID + Name):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            employees.put(id, name);
        }


        System.out.println("\n--- Sorted Employee Directory (by Employee ID) ---");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + "  Name: " + entry.getValue());
        }


        System.out.print("\nEnter Employee ID to search: ");
        int searchId = sc.nextInt();

        if (employees.containsKey(searchId)) {
            System.out.println("Employee Found: " + employees.get(searchId));
        } else {
            System.out.println("Employee not found!");
        }

        sc.close();
    }
}
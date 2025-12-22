import java.util.*;

public class AttendanceSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LinkedHashMap stores entries
        LinkedHashMap<Integer, String> attendance = new LinkedHashMap<>();

        System.out.println("Enter attendance of 5 students (roll number + name):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();


            if (attendance.containsKey(roll)) {
                System.out.println("Duplicate roll number! Entry ignored.\n");
                i--;
            } else {
                attendance.put(roll, name);
            }
        }


        System.out.println("\n--- Attendance List (Order of Entry) ---");
        for (Map.Entry<Integer, String> entry : attendance.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + "  Name: " + entry.getValue());
        }


        System.out.print("\nEnter roll number to search student: ");
        int searchRoll = sc.nextInt();

        if (attendance.containsKey(searchRoll)) {
            System.out.println("Student Found: " + attendance.get(searchRoll));
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}
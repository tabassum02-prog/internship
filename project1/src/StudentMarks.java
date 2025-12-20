import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> marksMap = new HashMap<>();

        // taking student data
        System.out.println("Enter roll number and marks for 5 students:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Roll Number " + i + ": ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks for roll " + roll + ": ");
            int marks = sc.nextInt();

            marksMap.put(roll, marks);
        }

        // updating marks
        System.out.print("\nEnter roll number to update marks: ");
        int updateRoll = sc.nextInt();

        if (marksMap.containsKey(updateRoll)) {
            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();

            marksMap.put(updateRoll, newMarks);
            System.out.println("Marks updated successfully!");
        } else {
            System.out.println("Roll number not found!");
        }

        // searches student by their marks
        System.out.print("\nEnter roll number to search marks: ");
        int searchRoll = sc.nextInt();

        if (marksMap.containsKey(searchRoll)) {
            System.out.println("Marks of roll " + searchRoll + ": " + marksMap.get(searchRoll));
        } else {
            System.out.println("Roll number not found!");
        }


        System.out.println("\nComplete HashMap:");
        System.out.println(marksMap);

        sc.close();
    }
}
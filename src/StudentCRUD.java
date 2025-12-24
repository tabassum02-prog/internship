import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }

    public void setName(String name) { this.name = name; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}

public class StudentCRUD {
    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student(id, name, course);
        list.add(s);
        System.out.println("Student Added Successfully!\n");
    }

    // Display All Students
    public void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        System.out.println("\n---- Student List ----");
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    // Search Student by ID
    public Student searchStudent(int id) {
        for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Update Student
    public void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student s = searchStudent(id);

        if (s == null) {
            System.out.println("Student not found!\n");
            return;
        }

        System.out.print("Enter New Name: ");
        String newName = sc.nextLine();

        System.out.print("Enter New Course: ");
        String newCourse = sc.nextLine();

        s.setName(newName);
        s.setCourse(newCourse);

        System.out.println("Updated Successfully!\n");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        Student s = searchStudent(id);

        if (s == null) {
            System.out.println("Student not found!\n");
            return;
        }

        list.remove(s);
        System.out.println("Deleted Successfully!\n");
    }

    // MAIN MENU
    public static void main(String[] args) {

        StudentCRUD obj = new StudentCRUD();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== Student Management ====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> obj.addStudent();
                case 2 -> obj.showStudents();
                case 3 -> {
                    System.out.print("Enter ID to Search: ");
                    int id = sc.nextInt();
                    Student st = obj.searchStudent(id);
                    if (st != null) System.out.println(st + "\n");
                    else System.out.println("Student not found!\n");
                }
                case 4 -> obj.updateStudent();
                case 5 -> obj.deleteStudent();
                case 6 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid Choice!\n");
            }
        }
    }
}
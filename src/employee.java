public class employee {
    private int empId;
    private String name;
    private String department;
    private double salary;

    public employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public void work() {
        System.out.println(name + " is working in " + department + " department.");
    }

    public void incrementSalary(double amount) {
        salary += amount;
        System.out.println("Salary updated. New salary: " + salary);
    }

    public void showDetails() {
        System.out.println(this.toString());
    }

    // Getters & Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "employee[empId=" + empId + ", name=" + name +
                ", department=" + department + ", salary=" + salary + "]";
    }
    public static void main(String[] args) {
        employee emp = new employee(1, "Ayesha", "Backend Developer", 30000);


        emp.showDetails();
        emp.work();
        emp.incrementSalary(5000);
        emp.showDetails();

    }

}
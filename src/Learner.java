//
public class Learner {
    private int id;
    private String name;
    private int age;
    private String course;

    public Learner(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is  attending the class.");
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String toString() {
        return "Learner[id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
    }
    public static void main(String[] args) {
        Learner s=new Learner(1, "Ayesha",20,"Computer Science");

        s.displayInfo();
        s.study();
        s.attendClass();
    }
}
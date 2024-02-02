public class Student {
    private int studentId;
    private String name;
    private int age;

    // Constructor with only student ID
    public Student(int studentId) {
        this.studentId = studentId;
    }

    // Constructor with student ID and name
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Full initialization constructor
    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}

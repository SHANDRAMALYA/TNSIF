package ASSIGNMENT_3;

public abstract class Student {
    protected int studentId;
    protected String studentName;
    protected String department;
    protected String gender;
    protected String category;
    protected double collegeFee;

    public Student(int studentId, String studentName, String department, String gender, String category, double collegeFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.gender = gender;
        this.category = category;
        this.collegeFee = collegeFee;
    }

    public abstract double calculateTotalFee();
    // Include getters and setters here
}



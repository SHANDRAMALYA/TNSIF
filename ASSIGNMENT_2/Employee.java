
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor with all attributes
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Constructor with name and employee ID
    public Employee(String name, int employeeId) {
        this(name, employeeId, 0.0);
    }

    // Constructor with name only
    public Employee(String name) {
        this(name, 0, 0.0);
    }

    // Getter methods (not necessary, but useful for accessing private attributes)
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}

package ASSIGNMENT_5;


	public abstract class Employee {
	    private String name;
	    private int employeeId;
	    private double baseSalary;

	    public Employee(String name, int employeeId, double baseSalary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.baseSalary = baseSalary;
	    }

	    public String getName() {
	        return name;
	    }

	    // Abstract method to be implemented by subclasses
	    public abstract double calculateSalary();
	}




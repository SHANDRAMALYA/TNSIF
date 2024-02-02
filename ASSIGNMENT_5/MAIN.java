package ASSIGNMENT_5;

public class MAIN {

	    public static void main(String[] args) {
	        // Create an array of Employee objects
	        Employee[] employees = new Employee[3];

	        // Instantiate Manager and Programmer objects
	        employees[0] = new Manager("John", 1001, 5000, 2000);
	        employees[1] = new Programmer("Alice", 1002, 4000, 100);
	        employees[2] = new Manager("Bob", 1003, 4500, 1800);

	        // Invoke calculateSalary() for each object to demonstrate dynamic polymorphism
	        for (Employee employee : employees) {
	            System.out.println(employee.getName() + "'s salary: $" + employee.calculateSalary());
	        }
	    }

}

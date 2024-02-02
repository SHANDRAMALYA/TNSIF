package ASSIGNMENT_5;


	public class Programmer extends Employee {
	    private double overtimePay;

	    public Programmer(String name, int employeeId, double baseSalary, double overtimePay) {
	        super(name, employeeId, baseSalary);
	        this.overtimePay = overtimePay;
	    }

	    // Implementing calculateSalary() for Programmer
	    @Override
	    public double calculateSalary() {
	        return getBaseSalary() + overtimePay;
	    }

		private double getBaseSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
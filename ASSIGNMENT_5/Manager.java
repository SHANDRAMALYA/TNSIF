package ASSIGNMENT_5;



	public class Manager extends Employee {
	    private double bonus;

	    public Manager(String name, int employeeId, double baseSalary, double bonus) {
	        super(name, employeeId, baseSalary);
	        this.bonus = bonus;
	    }

	    // Implementing calculateSalary() for Manager
	    @Override
	    public double calculateSalary() {
	        return getBaseSalary() + bonus;
	    }

		private double getBaseSalary() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

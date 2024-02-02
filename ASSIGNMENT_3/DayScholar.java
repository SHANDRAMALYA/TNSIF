package ASSIGNMENT_3;


	public class DayScholar extends Student {
	    private int busNumber;
	    private float distance;

	    public DayScholar(int studentId, String studentName, String department, String gender, String category, double collegeFee,
	            int busNumber, float distance) {
	        super(studentId, studentName, department, gender, category, collegeFee);
	        this.busNumber = busNumber;
	        this.distance = distance;
	    }

	    public double calculateTotalFee() {
	        // Implementation as specified in the question
	        // ...

	        double totalAmount = 0;
			return totalAmount;
	    }

	    // Include getters and setters here
	}
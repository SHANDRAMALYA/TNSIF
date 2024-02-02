package ASSIGNMENT_3;

public class Hosteller extends Student {
    private int roomNumber;
    private String blockName;
    private String roomType;

    public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee,
            int roomNumber, String blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }

    public double calculateTotalFee() {
        // Implementation as specified in the question
        // ...

        double totalAmount = 0;
		return totalAmount;
    }

    // Include getters and setters here
}


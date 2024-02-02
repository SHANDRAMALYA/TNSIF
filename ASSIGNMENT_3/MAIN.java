package ASSIGNMENT_3;
import java.util.Scanner;

public class MAIN {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter Student Id");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Student name");
        String studentName = scanner.nextLine();
        System.out.println("Enter Department name");
        String department = scanner.nextLine();
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        System.out.println("Enter category");
        String category = scanner.nextLine();
        System.out.println("Enter College fee");
        double collegeFee = scanner.nextDouble();

        if (category.equals("Hosteller")) {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter the room number");
            int roomNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter the Block name");
            String blockName = scanner.nextLine();
            System.out.println("Enter the room type");
            String roomType = scanner.nextLine();

            Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee,
                    roomNumber, blockName, roomType);

            double totalFee = hosteller.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        } else if (category.equals("DayScholar")) {
            System.out.println("Enter Bus number");
            int busNumber = scanner.nextInt();
            System.out.println("Enter the distance");
            float distance = scanner.nextFloat();

            DayScholar dayScholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee,
                    busNumber, distance);

            // Calculating and displaying total fee for DayScholar
            double totalFee = dayScholar.calculateTotalFee();
            System.out.println("Total College fee is " + totalFee);
        }

        scanner.close();
    }
}




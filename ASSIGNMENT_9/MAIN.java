package ASSIGNMENT_9;
import java.util.Scanner;


public class MAIN {
	 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from user
        System.out.println("Enter a number (0 to 9)");
        int number = scanner.nextInt();

        // Validate the input number and print the corresponding number name
        if (number >= 0 && number <= 9) {
            String[] numberNames = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println(numberNames[number]);
        } else {
            System.out.println("Invalid number");
        }

        scanner.close();
    }


}

package ASSIGNMENT_7;
import java.util.Scanner;

public class MAIN {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the number");
	        int number = scanner.nextInt();

	        if (isValidNumber(number)) {
	            NumberPuzzleSolver solver = new NumberPuzzleSolver();
	            int result = solver.solvePuzzle(number);
	            System.out.println(result);
	        } else {
	            System.out.println("Invalid number");
	        }

	        scanner.close();
	    }

	    private static boolean isValidNumber(int number) {
	        return number >= 10 && number <= 99;
	    }
}
package ASSIGNMENTS_8;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the length of the room (in cm)");
	        double length = scanner.nextDouble();
	        System.out.println("Enter the breadth of the room (in cm)");
	        double breadth = scanner.nextDouble();
	        System.out.println("Enter the plant area (in cm^2)");
	        double plantArea = scanner.nextDouble();

	        if (isValidRoomDimensions(length, breadth) && isValidPlantArea(plantArea)) {
	            OxygenProductionCalculator calculator = new OxygenProductionCalculator();
	            double oxygenProduction = calculator.calculateOxygenProduction(length, breadth, plantArea);
	            System.out.printf("%.2f", oxygenProduction);
	        }

	        scanner.close();
	    }

	    
	    private static boolean isValidRoomDimensions(double length, double breadth) {
	        if (length <= 0) {
	            System.out.println("Invalid length");
	            return false;
	        } else if (breadth <= 0) {
	            System.out.println("Invalid breadth");
	            return false;
	        }
	        return true;
	    }

	    private static boolean isValidPlantArea(double plantArea) {
	        if (plantArea <= 0) {
	            System.out.println("Invalid plant area");
	            return false;
	        }
	        return true;
	    }
}

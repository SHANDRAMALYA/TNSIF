package ASSIGNMENT_7;

public class NumberPuzzleSolver {
	
	    // Method to solve the number puzzle based on the given conditions
	    public int solvePuzzle(int number) {
	        if (number > 50) {
	            return getDigitDifference(number);
	        } else {
	            return getDigitDifference(reverseNumber(number));
	        }
	    }

	    // Method to get the difference between the digits of a number
	    private int getDigitDifference(int number) {
	        int tensDigit = number / 10;
	        int unitsDigit = number % 10;
	        return tensDigit - unitsDigit;
	    }

	    // Method to reverse the digits of a number
	    private int reverseNumber(int number) {
	        int reversedNumber = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        return reversedNumber;
	    }
	}


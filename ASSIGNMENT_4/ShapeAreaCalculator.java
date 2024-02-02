package ASSIGNMENT_4;

public class ShapeAreaCalculator {

	    
	    public void calculateArea(int sideLength) {
	        int area = sideLength * sideLength;
	        System.out.println("Area of square with side length " + sideLength + " is: " + area);
	    }

	    public void calculateArea(int length, int width) {
	        int area = length * width;
	        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);
	    }

	    public void calculateArea(double radius) {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of circle with radius " + radius + " is: " + area);
	    }
	}


package ASSIGNMENT_4;

public class MAIN {

    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        // Call calculateArea methods with different arguments to demonstrate static polymorphism
        calculator.calculateArea(5);
        calculator.calculateArea(3, 7);
        calculator.calculateArea(4.5);
    }
}


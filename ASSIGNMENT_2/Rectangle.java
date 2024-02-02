public class Rectangle {
    private double length;
    private double width;

    // Constructor with length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Constructor for a square with a single parameter
    public Rectangle(double side) {
        this(side, side);
    }

    // Getter methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

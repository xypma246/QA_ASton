package org.example.figures;

public class Circle implements Figure {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String toString() {
        return "\nCircle " +
                "perimeter = " + calculatePerimeter() + '\n' +
                "square = " + calculateSquare() + '\n' +
                "borderColor='" + borderColor + '\n' +
                "fillColor='" + fillColor + '\n' +
                '}';
    }
}

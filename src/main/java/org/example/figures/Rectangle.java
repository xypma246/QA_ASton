package org.example.figures;

public class Rectangle implements Figure {
    private final double height;
    private final double length;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double height, double length, String fillColor, String borderColor) {
        this.height = height;
        this.length = length;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return (height + length) * 2;
    }

    @Override
    public double calculateSquare() {
        return height * length;
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
        return "\nRectangle " +
                "perimeter = " + calculatePerimeter() + '\n' +
                "square = " + calculateSquare() + '\n' +
                "borderColor='" + borderColor + '\n' +
                "fillColor='" + fillColor + '\n' +
                '}';
    }
}

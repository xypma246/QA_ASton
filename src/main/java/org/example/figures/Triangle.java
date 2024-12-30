package org.example.figures;

public class Triangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        boolean isValid = this.isTriangleValid(sideA, sideB, sideC);
        if (!isValid) {
            throw new IllegalArgumentException("Стороны треугольника не сошлись, учи математику!");
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
    }

    private boolean isTriangleValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateSquare() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
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
        return "\nTriangle " +
                "perimeter = " + calculatePerimeter() + '\n' +
                "square = " + calculateSquare() + '\n' +
                "borderColor='" + borderColor + '\n' +
                "fillColor='" + fillColor + '\n' +
                '}';
    }
}

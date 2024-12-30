package org.example.figures;

public interface Figure {
    double calculatePerimeter();

    double calculateSquare();

    default String getBorderColor() {
        return "";
    }

    default String getFillColor() {
        return "";
    }

    default double calculatePerimeterRectangle(double sideA, double sideB) {
        return (sideA + sideB) * 2;
    }

    default double calculateSquareRectangle(double sideA, double sideB) {
        return sideA * sideB;
    }

    default double calculatePerimeterTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    default double calculateSquareTriangle(double sideA, double sideB, double sideC) {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    default double calculatePerimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calculateSquareCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

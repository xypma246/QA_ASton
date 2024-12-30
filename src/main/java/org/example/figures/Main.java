package org.example.figures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(5, 4, 7, "Yellow", "Black");
        Figure rectangle = new Rectangle(5, 7, "Red", "Purple");
        Figure circle = new Circle(8, "Green", "White");

        List<Figure> figures = new ArrayList<>();
        figures.add(triangle);
        figures.add(circle);
        figures.add(rectangle);

        System.out.println(figures);
    }
}

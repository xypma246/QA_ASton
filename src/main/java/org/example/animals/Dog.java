package org.example.animals;

public class Dog extends Animal {
    private static final int runMeters = 500;
    private static final int swimMeters = 10;
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int meters) {
        if (meters <= runMeters && meters > 0) {
            super.run(meters);
        } else if (meters > runMeters) {
            System.out.println(name + " устал. Он может пробежать только " + runMeters + "м.");
        } else {
            System.out.println(name + " не может бегать задом наперёд!");
        }
    }

    @Override
    public void swim(int meters) {
        if (meters <= swimMeters && meters > 0) {
            super.swim(meters);
        } else if (meters > swimMeters) {
            System.out.println(name + " утонул. Он может проплыть только " + swimMeters + "м.");
        } else {
            System.out.println(name + " не может плавать назад спиной!");
        }
    }

    public static int getCounter() {
        System.out.println(counter);
        return counter;
    }
}

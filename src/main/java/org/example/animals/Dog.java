package org.example.animals;

public class Dog extends Animal {
    private static final int RUN_METERS = 500;
    private static final int SWIM_METERS = 10;
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int meters) {
        if (meters <= RUN_METERS && meters > 0) {
            super.run(meters);
        } else if (meters > RUN_METERS) {
            System.out.println(name + " устал. Он может пробежать только " + RUN_METERS + "м.");
        } else {
            System.out.println(name + " не может бегать задом наперёд!");
        }
    }

    @Override
    public void swim(int meters) {
        if (meters <= SWIM_METERS && meters > 0) {
            super.swim(meters);
        } else if (meters > SWIM_METERS) {
            System.out.println(name + " утонул. Он может проплыть только " + SWIM_METERS + "м.");
        } else {
            System.out.println(name + " не может плавать назад спиной!");
        }
    }

    public static int getCounter() {
        System.out.println(counter);
        return counter;
    }
}

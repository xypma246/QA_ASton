package org.example.animals;

import org.example.animals.kitchen.Plate;

public class Cat extends Animal {

    private static final int runMeters = 200;
    private static int counter = 0;
    private final int hungerBar;
    private boolean satiety;

    @Override
    public String toString() {
        return "Cat{" +
                "hungerBar=" + hungerBar +
                ", satiety=" + satiety +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat(String name, int hungerBar) {
        super(name);
        this.hungerBar = hungerBar;
        this.satiety = false;
        counter++;
    }

    public void eat(Plate plate) {
        int plateFoodCapacity = plate.getFoodCapacity();

        if (plateFoodCapacity >= hungerBar) {
            satiety = true;
            System.out.println(name + " сыт!");
            plate.setFoodCapacity(plateFoodCapacity - hungerBar);
        } else {
            System.out.println("В миске недостаточно еды. " + name + " не стал подходить к ней.");
        }
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
        System.out.println(name + " утонул. Он не умеет плавать :(");
    }

    public static int getCounter() {
        System.out.println(counter);
        return counter;
    }
}

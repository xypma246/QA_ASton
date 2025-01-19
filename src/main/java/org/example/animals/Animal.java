package org.example.animals;

public class Animal {

    protected final String name;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public void run(int meters) {
        System.out.println(name + " пробежал " + meters + "м.");
    }

    public void swim(int meters) {
        System.out.println(name + " проплыл " + meters + "м.");
    }

    public static int getCounter() {
        System.out.println(counter);
        return counter;
    }
}

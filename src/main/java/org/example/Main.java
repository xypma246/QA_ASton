package org.example;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.kitchen.Plate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal barsik = new Cat("Барсик", 10);
        Animal yurik = new Cat("Юрик", 7);
        Animal princess = new Cat("Принцесса", 11);
        List<Animal> cas = new ArrayList<>();

        cas.add(barsik);
        cas.add(yurik);
        cas.add(princess);

        Animal bobik = new Dog("Бобик");
        Animal buran = new Dog("Буран");

        Animal turtle = new Animal("Капля");
        Animal lion = new Animal("Симба");

        barsik.run(-5);
        barsik.run(150);
        barsik.run(250);
        yurik.swim(40);

        bobik.run(-4);
        bobik.run(500);
        bobik.run(550);
        buran.swim(-10);
        buran.swim(9);
        buran.swim(200);

        turtle.run(550);
        lion.swim(10);

        Animal.getCounter();
        Cat.getCounter();
        Dog.getCounter();

        Cat[] cats = new Cat[3];

        Plate plate = new Plate(15);

        eatAllCat(cats, cas, plate);
        System.out.println("В миске " + plate.getFoodCapacity() + " еды.");

        plate.fill(50);
        eatAllCat(cats, cas, plate);
    }

    private static void eatAllCat(Cat[] cats, List<Animal> cas, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = (Cat) cas.get(i);
            cats[i].eat(plate);
        }
    }
}
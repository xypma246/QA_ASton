package org.example.animals.kitchen;

public class Plate {
    private int foodCapacity;

    public Plate(int foodCapacity) throws Exception {
        if (foodCapacity >= 0) {
            this.foodCapacity = foodCapacity;
        } else {
            throw new Exception("Нельзя класть отрицательное количество еды!");
        }
    }

    public void fill(int count) {
        foodCapacity = foodCapacity + count;
        System.out.println("Миска пополнена на " + count + ".");
    }

    public int getFoodCapacity() {
        return foodCapacity;
    }

    public void setFoodCapacity(int foodCapacity) {
        this.foodCapacity = foodCapacity;
    }
}

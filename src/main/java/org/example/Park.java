package org.example;

import java.util.Arrays;

public class Park {

    private Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        return "Park{" +
                "attractions=" + Arrays.toString(attractions) +
                '}';
    }

    static class Attraction {
        private String name;
        private String workHours;
        private double price;

        public Attraction(String name, String workHours, double price) {
            this.name = name;
            this.workHours = workHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workHours='" + workHours + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}

package org.example;

import java.util.Arrays;

public class Park {

    private final Attraction[] attractions;

    public Park(int attractionsSize) {
        this.attractions = new Attraction[attractionsSize];
    }

    public void addAttraction(Attraction attraction) {
        for (int i = 0; i < attractions.length; i++) {
            if (attractions[i] == null) {
                attractions[i] = attraction;
                return;
            }
        }
        System.out.println("Парк полон");
    }

    @Override
    public String toString() {
        return "Park{" +
                "attractions=" + Arrays.toString(attractions) +
                '}';
    }

    static class Attraction {
        private final String name;
        private final String workHours;
        private final double price;

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

package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"яблоко", "банан", "вишня", "яблоко", "апельсин",
                "банан", "груша", "вишня", "виноград", "яблоко",
                "киви", "банан", "манго", "апельсин", "груша"};


        Set<String> newFruits = new HashSet<>(List.of(fruits));
        System.out.println(newFruits);

        System.out.println(getCount(List.of(fruits)));

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Grigorev", "123");
        phoneBook.add("Grigorev", "456");
        phoneBook.add("Grigoreva", "789");
        phoneBook.add("Andreeva", "963");
        phoneBook.add("Kotikova", "147");
        phoneBook.add("Grigoreva", "753");

        System.out.println(phoneBook.get("Grigoreva"));
    }

    private static Map<String, Integer> getCount (List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for(String word : list) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result;
    }
}
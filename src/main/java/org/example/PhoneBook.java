package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void add (String lastName, String phoneNumber) {
        phoneBook.put(phoneNumber, lastName);
    }

    public Map<String, String> get(String lastName) {
        Map<String, String> result = new HashMap<>();
        for (Map.Entry<String, String> row : phoneBook.entrySet()) {
            if (row.getValue().equals(lastName)) {
                result.put(row.getKey(), row.getValue());
            }
        }
        return result;
    }
}

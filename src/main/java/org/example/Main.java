package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Park.Attraction[] attractions = new Park.Attraction[2];
        attractions[0] = new Park.Attraction(
              "DeathStranding",
              "7-18",
              300.50
        );
        attractions[1] = new Park.Attraction(
                "DeathStranding",
                "7-18",
                300.50
        );

        Park park = new Park(attractions);
        System.out.println(park);

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Maxim",
                "CEO",
                "123@maks.com",
                "777",
                25,
                30000.66
        );
        employees[1] = new Employee(
                "Yurik",
                "accountant",
                "111@maks.com",
                "666",
                5,
                3000.66
        );
        employees[2] = new Employee(
                "Princess",
                "teamlead",
                "888@maks.com",
                "8080",
                5,
                300.66
        );
        employees[3] = new Employee(
                "Olga",
                "QA",
                "1488@maks.com",
                "9063",
                24,
                30.66
        );
        employees[4] = new Employee(
                "Barsik",
                "Dev",
                "8956@maks.com",
                "444",
                5,
                300.66
        );
        System.out.println(Arrays.toString(employees));
    }
}
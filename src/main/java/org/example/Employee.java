package org.example;

public class Employee {
        private String name;
        private String position;
        private String email;
        private String telephone;
        private double salary;
        private int age;

        public Employee(String name, String position, String email, String telephone, int age, double salary) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.telephone = telephone;
                this.age = age;
                this.salary = salary;
        }

        @Override
        public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", position='" + position + '\'' +
                        ", email='" + email + '\'' +
                        ", telephone='" + telephone + '\'' +
                        ", salary=" + salary +
                        ", age=" + age +
                        '}';
        }
}



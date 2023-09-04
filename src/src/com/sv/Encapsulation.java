package com.sv;

public class Encapsulation {
        // Private attributes
        private String name;
        private int age;

        // Constructor
        public Encapsulation(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Public getter for name
        public String getName() {
            return name;
        }

        // Public setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Public getter for age
        public int getAge() {
            return age;
        }

        // Public setter for age
        public void setAge(int age) {
            if (age > 0) {  // simple validation
                this.age = age;
            }
        }
    }

       class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulation person = new Encapsulation("Alice", 25);

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            // Modifying attributes using setters
            person.setName("Bob");
            person.setAge(30);

            System.out.println("Updated Name: " + person.getName());
            System.out.println("Updated Age: " + person.getAge());
        }
    }

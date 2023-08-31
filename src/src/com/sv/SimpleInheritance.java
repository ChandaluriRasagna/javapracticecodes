package com.sv;

public class SimpleInheritance {
    String color="white";
    void eat()
    {
        System.out.println("Eating");
    }
}
class Inheritance extends SimpleInheritance
{
    String task="Inherit";
    void bark()
    {
        System.out.println("barking");
    }
}
class TestInheritance {
    public static void main(String[] args) {
        // Creating an object for the subclass
        Inheritance d = new Inheritance();

        // Accessing base class method
        d.eat();

        // Accessing derived class method
        d.bark();

        // Accessing base class instance variable
        System.out.println("Color: " + d.color);

        // Accessing derived class instance variable
        System.out.println("Breed: " + d.task);
    }

}

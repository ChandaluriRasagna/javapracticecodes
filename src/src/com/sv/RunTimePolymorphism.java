package com.sv;

public class RunTimePolymorphism {
    public void run() {
        System.out.println("Vehicle is running");
    }
}
 class Bike extends RunTimePolymorphism {
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }
}
 class TestPolymorphism {
    public static void main(String[] args) {
        RunTimePolymorphism v = new Bike();  // Upcasting
        v.run();
    }
}
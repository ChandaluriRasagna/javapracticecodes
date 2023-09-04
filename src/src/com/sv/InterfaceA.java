package com.sv;

public interface InterfaceA {
    // First interface with a display method
        default void display() {
            System.out.println("Display from InterfaceA");
        }
    }

    // Second interface, also with a display method
    interface InterfaceB {
        default void display() {
            System.out.println("Display from InterfaceB");
        }
    }

    // Class implementing both interfaces
    class MyClass implements InterfaceA, InterfaceB {
        // The class implementing multiple interfaces with default methods having the same name must override the method.
        @Override
        public void display() {
            InterfaceA.super.display();  // Call display of InterfaceA
            InterfaceB.super.display();  // Call display of InterfaceB
        }

        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.display();
            // Outputs:
            // Display from InterfaceA
            // Display from InterfaceB
        }
    }

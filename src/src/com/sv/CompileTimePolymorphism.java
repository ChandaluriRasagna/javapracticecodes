package com.sv;

public class CompileTimePolymorphism {
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (Overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        System.out.println("Result of adding two numbers: " + obj.add(10, 20));
        System.out.println("Result of adding three numbers: " + obj.add(10, 20, 30));
    }
}

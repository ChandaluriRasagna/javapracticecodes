package com.sv;
public class ArrayExceptionDemo {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            try {
                // This will throw an ArrayIndexOutOfBoundsException
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                System.out.println("This block always executes.");
            }
        }
    }
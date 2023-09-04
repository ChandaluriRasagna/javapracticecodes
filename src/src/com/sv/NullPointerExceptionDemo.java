package com.sv;

 class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String str = null;  // str is initialized to null
        try {
            int length = str.length();  // Trying to call a method on a null reference
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

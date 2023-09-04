package com.sv;

public class DivideByZeroException {
    public static void main(String[] args){
        try{
            int a=10;
            int result=a/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("error is "+e.getMessage());
        }
        finally {
            System.out.println("this is for cleanup tasks like closing files or database connections.");
        }
    }
}

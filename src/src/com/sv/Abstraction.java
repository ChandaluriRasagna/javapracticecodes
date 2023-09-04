package com.sv;
abstract class Abstraction {
    abstract void run();
    }
    class Honda4 extends Abstraction{
        void run(){System.out.println("running safely");}
        public static void main(String[] args){
            Abstraction obj = new Honda4();
            obj.run();
        }
    }
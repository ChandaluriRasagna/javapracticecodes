package com.sv;

public class MultilevelInheritance {
    void grandParent()
    {
        System.out.println("Grand parent class");
    }
}
class Level1 extends MultilevelInheritance{
    void parent()
    {
        System.out.println("Parent class");
    }
}
class Level2 extends Level1{
    void child()
    {
        System.out.println("child class");
    }
}
class Multilevel{
    public static void main(String[] args)
    {
        Level2 l=new Level2();
        l.grandParent();
        l.parent();
        l.child();
    }

}

package com.sv;

public class HierarchicalInheritance {
    void topLevel()
    {
        System.out.println("parent class");
    }
}
class LeftChild extends HierarchicalInheritance {
    void left()
    {
        System.out.println("left child");
    }
}
class RightChild extends HierarchicalInheritance{
    void right()
    {
        System.out.println("Right child");
    }
}
class Hierarchical{
    public static void main(String[] args)
    {
        LeftChild l=new LeftChild();
        l.left();
        l.topLevel();
        RightChild r=new RightChild();
        r.right();
        r.topLevel();
    }

}

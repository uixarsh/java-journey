package org.learn.oops.polymorphism;

public class Circle extends Shapes {
    
    @Override       // annotations.
    public void area () {
        // This will run when Object of circle is created
        // Hence, it is overriding the parent method
        System.out.println("Area is pi * squared(radius)");
    }

}

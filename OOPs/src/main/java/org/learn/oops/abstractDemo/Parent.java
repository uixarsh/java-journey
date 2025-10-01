package org.learn.oops.abstractDemo;

public abstract class Parent {
    // Any class that contains one or more Abstract methods it should also be declared as Abstract !

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // abstract  Parent ();    // Abstract constructors are not allowed !

    // Abstract class doesn't have a body so how can you call it ?
    // Static methods can't be overriden so there is no meaning in Abstract static methods !
    // Abstract methods are those that needs to be Overriden ........
    // there can't be any final abstract class as it will prevent it from being overridden...

    abstract void career ();
    abstract void partner ();

    static void greet () {
        System.out.println("Hey");
    }

    protected void normal () {
        System.out.println("this is a normal method....");
    }
}

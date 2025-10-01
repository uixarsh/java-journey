package org.learn.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        /* // Constructors overloading examples.
        Box b1 = new Box ();
        b1.information();

        Box b2 = new Box (4);
        b2.information();

        Box b3 = new Box (4, 8, 16);
        b3.information();

        Box b4 = new Box (b2);
        b4.information();

        // Child class
        BoxWeight b5 = new BoxWeight();
        b5.information();

        BoxWeight b6 = new BoxWeight(7, 8, 9, 11);
        b6.information(); */
        
        // Something new
        // Box b7 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(b7.width);
        // System.out.println(b7.weight);  // Error
        // it is actually the type of the referrence variable and not the type of the object that determines what members can be accessed

        // BoxWeight b8 = new Box(2, 4, 8);    // Error
        // trying to reference a child to a parent.
        // there are many variables in both parent and child classes.
        // you are given access to variables that are in the ref type i.e., BoxWeight
        // Hence you should have acess to weight variable.
        // this also means, that the ones you are trying to access should be initialized.
        // but here when the object is itself of type parent class how will you call the constructor of child class ?

        BoxTight b9 = new BoxTight();
        b9.information();
    }
}

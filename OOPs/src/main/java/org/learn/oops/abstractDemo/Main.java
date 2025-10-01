package org.learn.oops.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        son.partner();
        
        Daughter daughter = new Daughter(25);
        daughter.career();
        daughter.partner();


        //Parent mom = new Parent(23);        // For abstract classes you can't create objects like this you need to override it.
        Parent.greet(); // Since, its a static method...

        son.normal();
    }
}

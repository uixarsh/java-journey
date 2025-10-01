package org.learn.oops.staticKwd;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(23, "Kunal Kushawaha", 10000, false);
        Human rahul = new Human(34, "Rahul Sharma", 15000, true);

        System.out.println(kunal.name);
        System.out.println(rahul.married);
        
        // Don't do it for static variables like this....
        /* System.out.println(kunal.population);
        System.out.println(rahul.population); */

        // Do like this for static variables...
        System.out.println(Human.population);

        greeting(); // A static method can only access Static data it can't access non-static data.
    }

    /* void greeting () {
        // We know that something which is not static, belongs to an object !
    } */

    static void greeting () {
        // This is independent of any Object !
        System.out.println("Hello World !");
    }
}

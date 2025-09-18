package org.learn.lesson4;

public class Greet {
    public static void main(String[] args) {
        String name = "Kunal";
        greet(name);
        System.out.println(name);
    }

    static void greet (String name) {
        name = "Arsh";
    }
}

package org.learn.lesson6;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        // Character Addition
        System.out.println('a' + 'b');      // 195 => ASCII addition (97+98)

        // String Addition
        System.out.println("a" + "b");      // ab  -> concatenates more than one string

        // Java doesn't support operator overloading on our own.

        System.out.println('a' + 3);        // 100

        System.out.println((char)('a' + 3));    // d

        // int will to converted to Integer that will call .toString() method
        System.out.println("a" + 3);        // a3
        // this is same as after a few steps ===> "a" + "3" = "a3"

        System.out.println("Kunal" + new ArrayList<>());

        System.out.println("Kunal" + new Integer(56));

        // System.out.println(new Integer(45) + new ArrayList<>());
        // The operator + is defined for Primitives and when any one of these values is atleast a String

        System.out.println(new Integer(35) + " " + new ArrayList<>());
    }
}

package org.learn.oops.access;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        A obj = new A(32, "kunal");
        // obj.matrix;

        B obj1 = new B(32, "Arsh");
        // obj1.matrix;

        // need to do a few things.
        // 1. Access the data members.
        // 2. Modify the data members.

        // obj.num;    // it is private
        System.out.println(Arrays.toString(obj.arr));
        System.out.println("To get the object number : " + obj.getNum());
    }
}

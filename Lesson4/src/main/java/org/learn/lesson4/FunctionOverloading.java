package org.learn.lesson4;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(65);
        fun("Arsh");
        fun(1, 2);
        demo(1,2,3,4,5,6,7,7);
        demo("Arsh", "Vasu", "Kumal", "Kumar");
    }

    /*
     * 2 or more functions of same name can exists if the parameters are different
     * Function Overloading
     */
    static void fun (int a) {
        System.out.println(a);
    }

    static void fun (String name) {
        System.out.println(name);
    }

    static void fun (int a, int b) {
        System.out.println(a + b);
    }

    static void demo (int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }
}

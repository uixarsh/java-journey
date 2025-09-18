package org.learn.lesson4;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,56,34,14,134,13);
        fun();
        mult(1, 2, "Arsh", "Binod", "Rohit");
    }

    /*
     * int ...v 
     * Array of Integers
     * Variable length arguments
     */
    static void fun (int ...v) {    
        System.out.println(Arrays.toString(v));
    }


    /*
     * Variable arguments, Keyword arguments.
     * 
     * Variable length args must the last in this list.
     * for ex : int a, int ...x, int b --> error
     */
    static void mult (int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
}

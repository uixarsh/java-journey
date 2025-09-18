package org.learn.lesson4;

/* public class Shadowing {
    static int x = 90;          // this will be shadowed at line 11 as lower level overrides the upper level.
    public static void main(String[] args) {

        System.out.println(x);      // 90
        
        // Adding another variable in the Scope that overlaps
        // the variable with the higher level scope will gets hidden (shadowed)
        int x = 79;                 // the class variable at line 4 is shadowed by this !
        System.out.println(x);      // 79

        fun();
    }

    static void fun () {
        System.out.println(x);
    }
} */


public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {

        System.out.println(x);

        int x;
        /*
         * You can't access a value between declaration and initialization.
         * The variable had not been initialized.
         * Scope will actually begin once value is initialized.
         */
        // System.out.println(x);

        x = 40;
        System.out.println(x);

        fun();
    }

    static void fun () {
        System.out.println(x);
    }
}
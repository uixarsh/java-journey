package org.learn.lesson4;

public class Scopes {
    public static void main(String[] args) {
        
        /*
         * Function Scope
         */
        
        int a = 20;
        System.out.println(a);

        /*
         * Block Scope
         */

        /* {
            int z = 433;
            a = 200;    // Reassign the original value
            System.out.println(z);
        }
        System.out.println(a); */

        /*
        {
            int x = 78;
        }
        System.out.println(x); */    
        
        
        /*
         * Scoping in for loops
         */

        /* for (int i=0; i<6; i++){
            System.out.println(i);
        }
        System.out.println(i); */
    }

    /* static void xyz () {
        System.out.println(a);      // a is not in this function scope
    } */

}

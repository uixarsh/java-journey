package org.learn.lesson2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        /*
         * Find the largest of the 3 numbers
         */
        // int larg = 0;
        // if (a>b && a>c){
        //     larg = a;
        // }
        // else if (b>c){
        //     larg = b;
        // }
        // else {
        //     larg = c;
        // }

        int larg = Math.max(Math.max(a,b), c);
        System.out.println(larg);
    }
}

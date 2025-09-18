package org.learn.lesson4;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter No 2: ");
        num2 = sc.nextInt();

        System.out.println("The sum is: " + sum(num1, num2));
    }
    
    static int sum (int a, int b) {
        return a+b;
    }
}



/*
    * access_modifier  return_type  name  () {
    *  // body
    *  return statement;
    * }
*/

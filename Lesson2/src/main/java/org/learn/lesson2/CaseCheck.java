package org.learn.lesson2;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);       //trim() : removes extra spaces 

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
        

        /* String word = "Hello";
        System.out.println(word.charAt(2)); */
    }
}

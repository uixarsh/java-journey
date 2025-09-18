package org.learn.lesson3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        int day = 7;

        /* if (fruit.equals("mango")){
            System.out.println("King of Fruit!");
        }
        else if (fruit.equals("apple")){
            System.out.println("A Sweet Red Fruit!");
        } */


        /* switch(fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A Sweet Red Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruits");
                break;
            default:
                System.out.println("A Fruit");
        } */


        /* switch(fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A Sweet Red Fruit");
            case "Orange" -> System.out.println("Round Fruits");
            default -> System.out.println("A Fruit");
        } */


        
        /* switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        } */



        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
        

    }
}
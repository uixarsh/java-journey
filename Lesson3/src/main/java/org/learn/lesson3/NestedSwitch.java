package org.learn.lesson3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();

        /* switch(empID){
            case 1:
                System.out.println("Arsh Singhal");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                switch (dept){
                    case "IT":
                        System.out.println("IT Dept");
                        break;
                    case "Management":
                        System.out.println("Managerial Dept.");
                        break;
                    default:
                        System.out.println("No Department found");
                }
                break;
            default:
                System.out.println("Enter Correct Employee Id.");
        } */


        switch(empID){
            case 1 -> System.out.println("Arsh Singhal");
            case 2 -> System.out.println("Rahul");
            case 3 -> {
                    switch (dept) {
                        case "IT" -> System.out.println("IT Dept");
                        case "Management" -> System.out.println("Managerial Dept.");
                        default -> System.out.println("No Department found");
                    }
                }
            default -> System.out.println("Enter Correct Employee Id.");
        }
    }
}

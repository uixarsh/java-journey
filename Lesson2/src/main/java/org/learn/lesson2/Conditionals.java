/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.learn.lesson2;

/**
 *
 * @author arsh
 */
public class Conditionals {

    public static void main(String[] args) {

        /* int salary = 24500;
        if (salary > 10000){
            salary += 2000;
            }
        else {
            salary +=1000;
            }
        System.out.println(salary); */

        // Multiple if-else

        int salary = 24500;
        if (salary>10000) {
            salary+=2000;
        }
        else if (salary > 20000) {
            salary+=3000;
        }
        else {
            salary+=1000;
        }
        System.out.println(salary);
    }
}

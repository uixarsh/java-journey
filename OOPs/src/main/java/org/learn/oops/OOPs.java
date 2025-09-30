/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.learn.oops;

/**
 *
 * @author arsh
 */
public class OOPs {

    public static void main(String[] args) {
        // store 5 roll nos.
        int [] roll_nos = new int [5];

        // store 5 names.
        String [] names = new String[5];

        // Store data of 5 students.
        // roll_no, name, marks
        int [] roll_no = new int[5];
        String [] name = new String [5];
        float [] marks = new float [5];
        // you just created different data type to store every single element.
        // need to store all 3 things in single data structure.


        // A class is a named group of properties and functions.....
        // create your own data type.
        Student [] stu = new Student[5];

        Student kunal;
    }

    // Create a class
    class Student {
        int [] roll_no = new int[5];
        String [] name = new String[5];
        float [] marks = new float[5];
    }
}

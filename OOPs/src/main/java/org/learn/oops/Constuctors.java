/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.learn.oops;

/**
 *
 * @author arsh
 */
public class Constuctors {

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
        // System.out.println(Arrays.toString(stu));

        Student kunal;      // declaration
        kunal = new Student();

        Student stud = new Student();
        stud.roll_no = 10;
        stud.name = "Arsh Singhal";
        stud.marks = 90.9f;
        
        Student stud2 = new Student();
        stud2.greeting();
        stud2.changeName("Shoe lover");
        stud2.greeting();

        Student stud3 = new Student(5, "arsh singhal", 55.4f);
        stud3.greeting();

        Student stud4 = new Student(stud3);
        stud4.greeting();

        Student random = new Student();
        random.greeting();

        
        Student one = new Student();
        Student two = one;
        one.name = "Arsh";
        System.out.println(two.name);
    }

}

class Student {
    // Instance variables.
    int roll_no;
    String name;
    float marks;

    // Constructor
    Student () {
        // this is how you call a constructor from another constructor.
        this (0, "", 0.0f);
    }

    // Constructor overloading.
    Student (int r_no, String nm, float mks) {
        this.roll_no = r_no;
        this.name = nm;
        this.marks = mks;
    }

    Student (Student other) {
        this.name = other.name;
        this.roll_no = other.roll_no;
        this.marks = other.marks;
    }

    public void greeting () {
        System.out.println("Hello my name is " + this.name);
    }

    void changeName (String newName){
        this.name = newName;
    }
}
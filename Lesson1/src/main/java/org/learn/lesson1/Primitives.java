package org.learn.lesson1;

public class Primitives {
    public static void main(String[] args) {
        // Primitives data types are those you can't break further
        int rollno = 64;        // 4 bytes
        char letter = 'r';
        float marks = 912.123f;     // why f
        double largeDecimalNos = 2332342323.23233234432;        // all the decimal values in java are of type Double
        long largeInt = 123221222342323234L;    // 8 bytes  // why L // all are by default of type integer so need to add L over here.
        boolean check = true;
        // String is not primitives.
        
        // Wrapper class
        // Add more functionalities to primitives.
        Integer rno = 53;
        rno.hashCode();
    }
}

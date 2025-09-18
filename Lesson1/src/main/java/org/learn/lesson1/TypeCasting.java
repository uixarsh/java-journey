package org.learn.lesson1;

public class TypeCasting {
    public static void main(String[] args) {
        /* Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num); */
        /*Destination type > Source type ==> 
        float > int  as 
        float = int+decimal > int*/

        // NARROWING CONVERSION
        // Typecasting
        /* int x = (int)(44.234f);
        System.out.println(x); */

        // Automatic type promotion in expression
        // in byte you can't store >256 so the result it is giving is the remainder of <<<< val%256 >>>>
        /* int a = 257;        // 257 % 256
        byte b = (byte)(a);     // 1
        System.out.println(b); */

        /* byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b) / c;
        System.out.println(d); */

        /* byte b = 50;
        // b = b * 2;  // throws an error as during byte evalutions it automatically converts it into int and int result can't be stored in byte.
        b = (byte)(b*2);
        System.out.println(b); */

        /* int num = 'A';
        System.out.println(num);        // Java follows the unicode principles */

        // Type promotion rules
        /*
         * All the (byte, short, char values) are promoted to integer
         * If any one of the operands is long then whole operation converts into long, float -> float, double -> double.
         * int * float = float
         * int * double = double
         */


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.64f;
        double d = 0.1234;
        double rslt = (f * b) + (i / c) - (d - s);      // float + int - double = double
        System.out.println(rslt);
    }
}

package org.learn.lesson6;

public class Comparision {
    public static void main(String[] args) {

        String a = new String("Kunal");
        String b = new String("Kunal");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.charAt(2));    // can't do like a[2] => Throws an error...
    }
}




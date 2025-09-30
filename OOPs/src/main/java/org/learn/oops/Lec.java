package org.learn.oops;

public class Lec {
    public static void main(String[] args) {
        
        B obj = new B("Arsh Singhal");
        System.out.println(obj);
    }
}

class B {
    final int num = 10;
    String name;

    public B (String name){
        this.name = name;
    }

}
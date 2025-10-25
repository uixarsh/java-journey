package org.learn.oops.singleton;

public class Main {

    // only one object is created in the memory.....
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }

}

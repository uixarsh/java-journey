package org.learn.oops.singleton;

public class Singleton {

    // Constructor made private to prevent instantiation from other classes
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance () {
        // check whether one object is created or not 
        if (instance == null) {
            instance = new Singleton ();
        }

        return instance;
    }   
    
}

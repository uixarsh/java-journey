package org.learn.oops.interfaces.defaultImplementationInterfaces;

public interface A {

    // static interface methods should always have a body.
    // need to call via the Interface names.
    static void greeting () {
        System.out.println("Hey I'm static method.");
    }

    default void fun () {
        System.out.println("Hi I'm in A");
    }

}

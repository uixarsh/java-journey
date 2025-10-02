package org.learn.oops.interfaces.defaultImplementationInterfaces;

public class Main implements A, B{
    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }

    //////////////////////////////////////////////////////////////////
    // You have to implement both the methods since B is extending A.
    //////////////////////////////////////////////////////////////////
    
    @Override
    public void fun() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fun'");
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }
}

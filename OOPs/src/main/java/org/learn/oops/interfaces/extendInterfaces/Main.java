package org.learn.oops.interfaces.extendInterfaces;

public class Main implements B{
    public static void main(String[] args) {
        
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

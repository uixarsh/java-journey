package org.learn.oops.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career (){
        System.out.println("I'm going to be a Doctor");
    }

    @Override
    void partner (){
        System.out.println("I love becoming a Doctor");
    }

}

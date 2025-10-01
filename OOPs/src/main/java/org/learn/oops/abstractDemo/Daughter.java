package org.learn.oops.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career (){
        System.out.println("I'm going to be a Scientist");
    }

    @Override
    void partner (){
        System.out.println("I love becoming a Scientist");
    }
}

package org.learn.oops.interfaces;

public class CDPlayer implements Media{

    @Override
    public void pause() {
        System.out.println("Music Stop");
    }

    @Override
    public void play() {
        System.out.println("Music Start");
    }
    
}

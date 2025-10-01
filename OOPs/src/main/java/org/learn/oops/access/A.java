package org.learn.oops.access;

public class A {
    protected int [] matrix = new int[3];
    private int num;
    String name;
    int [] arr;
    

    public A (int num, String name){
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }

    public int getNum () {
        return this.num;
    }

    public void setNum (int num) {
        this.num = num;
    }
}

package org.learn.oops.polymorphism;

public class Numbers {

    public int sum (int a, int b){
        return a + b;
    }

    public int sum (int a, int b, int c){
        return a+b+c;
    }

    public int sum (String x, int b){
        return b;
    }

    public double sum (double a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1d,2);
        obj.sum(1,2,39);
        obj.sum("Arsh", 3);
    }
}

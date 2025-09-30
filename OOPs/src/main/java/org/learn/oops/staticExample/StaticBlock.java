package org.learn.oops.staticExample;

public class StaticBlock {
    // this is a demo to show initialization of static variables....
    static int a = 4;
    static int b;

    // static block
    static {
        // will only run once, when the first object is created i.e, when the class is loaded for the first time.
        System.out.println("I'm in a static block...");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        // I'm in static block only run once.......
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

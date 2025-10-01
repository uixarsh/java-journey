package org.learn.oops.inheritance;

public class Box {
    double length;
    double height;
    double width;

    public Box () {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    public Box (double side) {
        // Cube
        this.height = side;
        this.length = side;
        this.width = side;
    }

    public Box (double length, double width, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box (Box old) {
        this.height = old.height;
        this.length = old.length;
        this.width = old.width;
    }

    public void information () {
        System.out.println("Running the box : " + this.length*this.width*this.height);
    }

    public static void greeting () {
        System.out.println("Hey, there I'm inside Box...");
    }
}


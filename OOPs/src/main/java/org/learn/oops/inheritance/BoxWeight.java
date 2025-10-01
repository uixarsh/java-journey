package org.learn.oops.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight () {
        this.weight = -1;
    }

    public BoxWeight (double l, double w, double h, double wt){
        super(l, w, h);         // call the parent class constructor.
        // used to initialize values in parent class
        this.weight = wt;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double side, double wt){
        super(side);
        this.weight = wt;
    }

    @Override
    public void information () {
        System.out.println("Running the Box Weight : " + this.height*this.length*this.width + "unit3 along with : " + this.weight +"units");
    }

    // @Override
    // public static void greeting() {
    //     System.out.println("Hi, I'm overriden");
    // }
}

package org.learn.oops.inheritance;

public class BoxTight extends BoxWeight{
    double cost;

    public BoxTight () {
        super();
        this.cost = -1;
    }

    public BoxTight (BoxTight other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxTight (double l, double w, double h, double wt, double cst) {
        super(l, w, h, wt);
        this.cost = cst;
    }

    public BoxTight (double side, double wt, double cst){
        super(side, wt);
        this.cost = cst;
    }
}

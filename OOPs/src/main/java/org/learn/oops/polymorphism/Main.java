package org.learn.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sp = new Shapes();
        sp.area();
        
        Circle cr = new Circle();
        cr.area();

        Square sq = new Square();
        sq.area();

        Triangle tr = new Triangle();
        tr.area();

        Shapes st = new Square();
        st.area();
    }
}

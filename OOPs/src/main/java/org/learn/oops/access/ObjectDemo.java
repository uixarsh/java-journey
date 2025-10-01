package org.learn.oops.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public ObjectDemo() {
    }

    @Override
    public  int hashCode () {
        return super.hashCode();
    }

    @Override
    public boolean equals (Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString () {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 56.8f);

        if (obj1 == obj2){
            System.out.println("Objects are compared with ==");
        }
        
        if (obj1.equals(obj2)){
            System.out.println("Objects are compared with .equals()");
        }

        System.out.println(obj1 instanceof Object);
        System.out.println(obj1 instanceof ObjectDemo);

        System.out.println(obj1.getClass().getName());
    }

}

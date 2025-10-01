
package org.learn.oops.introduction;

public class WrapperExp {
    public static void main(String[] args) {
        int abx  = 10;
        // abx.  // not many methods

        Integer num = 10;
        // or
        Integer num1 = new Integer(10);
        // num. // many methods

        int x = 10;
        int y = 20;
        swap(x, y);       // it won't be going to be swap.
        System.out.println(x + " " + y);        // 10 20

        Integer a = 10;
        Integer b = 20;
        swap1(a,b);       // still not swapping despite making them object too.
        System.out.println(a + " " + b);        // 10 20

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "Other name";      // you can change the value of it.

        // when a non primitive is final, you cannot reassign it.
        // kunal = new A("New object");


        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
        }
    }

    static void swap (int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap1 (Integer a, Integer b){
        // Integer Wrapper class is a final class !
        Integer temp = a;
        a = b;
        b = temp;
    }
}


class A {
    final int num = 10;
    String name;

    public A (String name){
        System.out.println("Object is created !");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed !");
    }
}
package org.learn.oops.staticKwd;

/* 
 * static public class InnerClass {}  
 * Outside classes can't be static as it is not itself dependent on any other class.
 * generates an error.
 * 
 * Only inner classes can be static.....
 */

public class InnerClasses {

    static class Test {
        String name;

        public Test (String name){
            this.name = name;
        } 

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test ("Kunal");
        Test b = new Test ("Rahul");
        System.out.println(a);
        System.out.println(b);
    }
}

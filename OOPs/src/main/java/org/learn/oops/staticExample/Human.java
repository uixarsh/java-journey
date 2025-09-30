package org.learn.oops.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human (int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population+=1;
    }

    static void message () {
        // you can't use anything that is specifically pointing towards an object
        // From static you can't use non-statics.....
        /* System.out.println(this.age); */
    }
}

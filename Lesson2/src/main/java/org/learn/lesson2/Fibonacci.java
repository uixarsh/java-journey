package org.learn.lesson2;

public class Fibonacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13,......
        int a = 0;
        int b = 1;
        int n = 7;
        int cnt = 2;

        while (cnt<=n){
            int temp = b;
            b+=a;
            a = temp;
            cnt++;
        }
        System.out.println(b);

    }
}

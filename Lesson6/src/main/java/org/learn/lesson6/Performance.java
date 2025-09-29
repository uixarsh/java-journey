package org.learn.lesson6;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);
            // System.out.print(ch + " ");
            series += ch;
        }

        /*
         * ""
         * "" + "a" = "a"
         * "a" + "b" = "ab"
         * "ab" + "c" = "abc"
         * .
         * .
         * .
         * .
         * new objects gets created every time....
         * "", a, ab, abc, abcd, abcde, abcdef, abcdefg, ................, abcdefghijklmnopqrstuvwxyz
         * will have no referrrence variables 
         * O(n2)
         * 1+2+3+4+.........+N = N2
         */
        System.out.println(series);


        /*
         * Can we create a new data type which doesn't create a new object everytime it invokes.
         * series = "abc" + "d" ---> "abcd"  // no new object is created
         * String builder is the answer......
         */
    }
}

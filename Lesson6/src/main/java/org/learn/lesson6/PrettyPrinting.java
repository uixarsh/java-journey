package org.learn.lesson6;

public class PrettyPrinting {
    public static void main(String[] args) {
        /*
         * PLACEHOLDERS
         * 
            %s: String
            %d: Decimal integer (base 10)
            %f: Floating-point number
            %c: Character
            %b: Boolean
            %o: Octal integer (base 8)
            %x: or %X: Hexadecimal integer (base 16)
            %e: or %E: Exponential floating-point number
            %g: or %G: General floating-point format (uses either %f or %e depending on value and precision)
            %n: Platform-specific line separator (newline)
            %t: Date/time formatting (requires a secondary character to specify the date/time component, e.g., %tY for year, %tm for month)
         */
        float a = 453.2393f;        
        System.out.printf("Formatted number is %.2f", a);   // Rounds off as well
        System.out.println();
        System.out.printf(" Value of Pi is : %.4f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I'm %s", "Kunal", "Cool");
    }
}

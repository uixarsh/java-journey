import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Method 1
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Method 2
        // for-each loop
        for (int j : arr) {
            System.out.print(j + " ");
        }

        // Method 3
        System.out.println(Arrays.toString(arr));
    }
}

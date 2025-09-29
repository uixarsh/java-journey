import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        int [][] matrix = new int [3][3];        // only need to specify no of rows, no need to specify columns....
        Scanner sc = new Scanner(System.in);

        // Input 
        for (int i=0; i < matrix.length; i++){
            for (int j=0 ; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Method 1
        for (int [] i : matrix){
            System.out.println(Arrays.toString(i));
        }
    
        // Method 2
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Method 3
        for (int i=0; i< matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

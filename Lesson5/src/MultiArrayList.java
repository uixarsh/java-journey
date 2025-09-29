
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        // Initialization
        for (int i=0; i<3; i++){
            matrix.add(new ArrayList<>());
        }
        
        System.out.println(matrix);
        
        // Adding elements in a 2D array...
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matrix.get(i).add(sc.nextInt());
            }
        }

        System.out.println(matrix);
    }
}

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) throws Exception {
        int[] roll_no = new int[5];
        // System.out.println(roll_no[1]);
        System.out.println(Arrays.toString(roll_no));

        String[] arr = new String[4];
        // System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        String str = null;
        // int num = null; // Error, can't do it for Primitivies data type.
        System.out.println(str);
    }
}
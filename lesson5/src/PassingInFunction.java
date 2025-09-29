import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void change (int [] arr){
        // Mutability
        // Strings are Immutable in Java while Arrays are mutable in Java.
        arr[0] = 99;
    }
}

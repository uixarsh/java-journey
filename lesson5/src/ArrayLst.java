import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(10);     // only initial value in constructor.

        for (int i=0; i< 30; i++){
            list.add(i);
        }
        
        System.out.println(list.contains(12));
        list.set(0, 89);
        list.remove(0);     // INDEX
        System.out.println(list);

        // Get item at any index
        for (int i = 0; i < 29; i++) {
            System.out.print(list.get(i) + " ");    // list[idx] => Syntax will not work here.....
        }
    }
}

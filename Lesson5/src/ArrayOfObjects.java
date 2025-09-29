import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] str = new String[4];

        for (int i = 0 ; i < str.length ; i++){
            str[i] = sc.next();
        }

        for (String j : str){
            System.out.println(j);
        }
    }
}

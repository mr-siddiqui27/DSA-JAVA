import java.util.Scanner;

public class ArrayUtil {
    static Scanner sc = new Scanner(System.in);

    public static void Input(int[] arr){
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

}

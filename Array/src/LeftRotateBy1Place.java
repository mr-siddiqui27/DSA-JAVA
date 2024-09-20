import java.util.Scanner;

public class LeftRotateBy1Place{

    public static void leftRotateBy1place(int[] arr){
        int temp = arr[0];
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=temp;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        leftRotateBy1place(arr);

        ArrayUtil.print(arr);

    }
 }
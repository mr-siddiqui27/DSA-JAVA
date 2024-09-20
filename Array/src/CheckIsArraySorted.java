import java.util.Scanner;

public class CheckIsArraySorted {

    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        if ( isSorted(arr)){
            System.out.println("sorted");
        } else{
            System.out.println("not sorted");
        }
    }


}

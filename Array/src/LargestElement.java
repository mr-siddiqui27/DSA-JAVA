import java.util.Scanner;

public class LargestElement {

    static int largestElement(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int max = largestElement(arr,n);

        System.out.printf("largest element is %d ",max);

    }
}

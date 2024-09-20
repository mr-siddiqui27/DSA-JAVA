import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            int didswap = 0;
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] -= arr[j+1];
                    didswap=1;
                }
            }
            if(didswap==0){             // array is already shorted
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        bubbleSort(arr);

        ArrayUtil.print(arr);
    }

}

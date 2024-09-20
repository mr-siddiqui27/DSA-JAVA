import java.util.Scanner;

public class InsertionSort {

    static void insertion(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            int t =i;
            while(t>0 && arr[t]<arr[t-1]){
                arr[t] += arr[t-1];
                arr[t-1] = arr[t]-arr[t-1];
                arr[t]-=arr[t-1];
                t--;
            }
        }
    }


// by me
    static void insertionSort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                int t =i+1;
                while(t>0 && arr[t]<arr[t-1]){
                    arr[t] += arr[t-1];
                    arr[t-1] = arr[t]-arr[t-1];
                    arr[t]-=arr[t-1];
                    t--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        insertionSort(arr);
        ArrayUtil.print(arr);

    }
}

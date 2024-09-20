

import java.util.Scanner;

public class QuickSort {

    static int partition(int[] arr, int low, int high){
        int i=low+1,j=high;
        while(i<j){
            while( i<=high && arr[low]>arr[i] ){
                i++;
            }
            while( j>=low && arr[low]<arr[j] ){
                j--;
            }
            if(i<j){
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
                i++;
                j--;
            }

        }
        return j;
    }

    static void quickSort(int[] arr, int l, int r){
        if (l>=r){
            return;
        }
//
        int j= partition(arr,l,r);
        int t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;

        quickSort(arr,l,j-1);
        quickSort(arr,j+1,r);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        quickSort(arr,0,7);
        ArrayUtil.print(arr);
    }
}

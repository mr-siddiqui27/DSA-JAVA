import java.util.Scanner;

public class SelectionSort {

    static void sortArr(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    arr[i] += arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] -= arr[j];
                }
            }
        }
    }

    static void sort(int[] arr){
        for (int i=0; i<arr.length-1;i++){
            int min=i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            arr[i] += arr[min];
            arr[min] = arr[i]-arr[min];
            arr[i] -= arr[min];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        sort(arr);

        ArrayUtil.print(arr);
    }
}

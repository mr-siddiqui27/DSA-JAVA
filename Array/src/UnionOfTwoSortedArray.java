import java.util.Scanner;

public class UnionOfTwoSortedArray {

    public static int[] union(int[] arr1, int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        int[] arr = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){

            // Skip duplicates in arr1
            while (i < m - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j < n - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            }

            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
                k++;
            } else if(arr1[i]>arr2[j]){
                arr[k] = arr2[j];
                j++;
                k++;

            } else{
                arr[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }


        while(i<m){
            // Skip duplicates in arr1
            while (i < m - 1 && arr1[i] == arr1[i + 1]) {
                i++;
            }
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n){
            // Skip duplicates in arr2
            while (j < n - 1 && arr2[j] == arr2[j + 1]) {
                j++;
            }
            arr[k] = arr2[j];
            j++;
            k++;
        }

        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.print("Enter Elements: ");
        ArrayUtil.Input(arr1);

        System.out.print("Enter Size of second array: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter Elements: ");
        ArrayUtil.Input(arr2);

        int[] arr = union(arr1,arr2);

        ArrayUtil.print(arr);
    }
}

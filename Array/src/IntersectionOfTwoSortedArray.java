import java.util.Scanner;

public class IntersectionOfTwoSortedArray {

    public static int[] intersection(int[] arr1, int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        int[] arr = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(  arr1[i]==arr2[j]){
                arr[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if(arr1[i]<arr2[j]){
                i++;
            } else{
                j++;
            }
        }
        int[] result = new int[k];
        System.arraycopy(arr,0,result,0,k);

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

        int[] arr = intersection(arr1,arr2);

        ArrayUtil.print(arr);
    }
}

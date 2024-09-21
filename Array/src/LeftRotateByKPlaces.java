import java.util.Scanner;

public class LeftRotateByKPlaces {

    public static void swap(int[] arr, int l, int r){
        int temp;
        while(l<r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void rightRotateByKPlace(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);

    }

    public static void leftRotateByKPlaceM1(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        swap(arr,k,n-1);
        swap(arr,0,k-1);
        swap(arr,0,n-1);
    }

    public static void leftRotateByKPlaceM2(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        int[] temp = new int[k];
        System.arraycopy(arr, 0, temp, 0, k);
        int i,nc=k;
        for (i=0; i<n-nc; i++){
            arr[i]=arr[k];
            k++;
        }
        int j=0;
        while(i<n){
            arr[i] = temp[j];
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int[] arr2 = arr.clone();

        leftRotateByKPlaceM1(arr,2);
        ArrayUtil.print(arr);



        rightRotateByKPlace(arr2,3);
        ArrayUtil.print(arr2);
    }
}

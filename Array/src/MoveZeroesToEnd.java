import java.util.Scanner;

public class MoveZeroesToEnd {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeroesToEnd(int[] arr){
        int n=arr.length;
        int k=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k<n){
            arr[k] = 0;
            k++;
        }
    }

//    Method 2

    public static void moverZeroesToEndM2(int[] arr){
        int n=arr.length;
        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1; i<n; i++){
                if(arr[i]!=0){
                    swap(arr,i,j);
                    j++;
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
//        moveZeroesToEnd(arr);

        moverZeroesToEndM2(arr);

        ArrayUtil.print(arr);
    }
}

import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr, int l, int m, int r){
        int t=l;
        int i=l, j=m+1;
        int[] temp = new int[r+1];
        while(i<=m || j<=r){
            if (i<=m && j<=r){
                if (arr[i]<arr[j]){
                    temp[l] = arr[i];
                    l++;
                    i++;
                } else{
                    temp[l] = arr[j];
                    l++;
                    j++;
                }
            } else{
                if(i<=m){
                    while(i<=m){
                        temp[l] = arr[i];
                        i++;
                        l++;
                    }
                } else{
                    while(j<=r){
                        temp[l] = arr[j];
                        j++;
                        l++;
                    }
                }
            }

        }
       for (i=t; i<=r;i++){
           arr[i] = temp[i];
       }
    }

    static void mergeSort(int[] arr, int l, int r){
        if (l==r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);
        mergeSort(arr,0,arr.length-1);
        ArrayUtil.print(arr);
    }
}

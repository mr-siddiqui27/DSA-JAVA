import java.util.Scanner;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] arr){
        int n = arr.length;
        int j=1;
        int temp = arr[0];
        int count_unique = 1;
        for (int i=1; i<n; i++){
            if (arr[i]!=temp){
                temp = arr[i];
                arr[j] = arr[i];
                j++;
                count_unique++;
            }
        }
        return count_unique;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int size = removeDuplicates(arr);

        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

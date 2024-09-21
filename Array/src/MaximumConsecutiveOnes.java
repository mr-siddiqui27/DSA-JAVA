import java.util.Scanner;

//Given a binary array arr, return the maximum number of consecutive 1's in the array
public class MaximumConsecutiveOnes {

    public static int maximumCOnes(int[] arr){
        int n = arr.length;
        int max = 0;
        int count, i= 0;
        while(i<n){
            count=0;
            if(arr[i]!=1){
                i++;
                continue;
            }
            while(i<n && arr[i]==1){
                count++;
                i++;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int maxOnes = maximumCOnes(arr);

        System.out.println(maxOnes);

    }
}

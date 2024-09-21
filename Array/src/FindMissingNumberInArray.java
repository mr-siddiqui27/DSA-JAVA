// Given an array arr containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.Scanner;

public class FindMissingNumberInArray {

    public static int findMissing(int[] arr){
        int ans=arr.length;
        for (int i=0; i<arr.length; i++){
            ans += i - arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int num = findMissing(arr);

        System.out.println(num);
    }
}

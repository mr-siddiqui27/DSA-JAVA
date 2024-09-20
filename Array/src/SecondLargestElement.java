import java.util.Scanner;

public class SecondLargestElement {

    public static int secondLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int second_max = max;
        for (int num : arr){
            if(max<num){
                second_max = max;
                max = num;
            } else if(second_max<num && max>num){
                second_max = num;
            }

        }
        if (second_max==Integer.MIN_VALUE){
            return -1;
        }
        return second_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayUtil.Input(arr);

        int sm = secondLargestElement(arr);

        if (sm==-1){
            System.out.println("second largest doesn't exist");
        } else{
            System.out.printf("Second largest element is %d",sm);
        }



    }
}

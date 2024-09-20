import java.util.Scanner;
public class Fabonacci{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter number of terms : ");
        int n=input.nextInt();
        int f=0,l=1,next;
        for(int i=1;i<=n;i++){
            System.out.print(f);
            next=f+l;
            f=l;
            l=next;
        }
        input.close();
    }
}
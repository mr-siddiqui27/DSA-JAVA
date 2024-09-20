#include<stdio.h>

void method1(int a, int b){
        int gcd=1;
        for(int i=1;i<=(a/2);i++){
            if(a%i==0 && b%i==0){
                if(i>gcd){
                    gcd=i;
                }
            }
        }        
        printf("gcd of the number is : %d",gcd);     
        
    }
void method2(int a, int b){
    for(int i=b;i>=1;i--){
        if(a%i==0 && b%i==0){
            printf("gcd of the number is %d",i);
            break;
        }
    }
}
void method3(int a, int b){
    // gcd(a,b) = gcd(a-b,b)  when a>b
    //ex- gcd(20,15) = gcd(5,15)
    //    gcd(15,5)  = gcd(10,5)
    //    gcd(10,5)  = gcd(5,5)
    //    gcd(5,5)   = gcd(0,5)   gcd->5
    while(a!=0){
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        a=a-b;
    }
    printf("gcd of the number is %d ",b);
}
void upgretm3(int a,int b){
    // gcd(a,b) = gcd(a%b,b)
    // gcd(20,15) = gcd(5,15)
    // gcd(15,5) = gcd(0,5)
    while(a!=0){
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        a=a-b;
    }
    printf("gcd of the number is %d ",b);

}
int main(){
    int a,b;
    printf("enter first number :");
    scanf("%d",&a);
    printf("enter second number :");
    scanf("%d",&b);
    if(b>a){
        int temp=a;
        a=b;
        b=temp;
    }  
    
    upgretm3(a,b);

    return 0;
}
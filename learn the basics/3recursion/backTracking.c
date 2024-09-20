#include<stdio.h>

void Decreasing(int count , int n){
    if(count > n){
        return;
    }
    Decreasing(count+1 , n);
    printf("%d ",count);
}

void increasing(int n){
    if(n==0){
        return;
    }
    increasing(n-1);
    printf("%d ",n);
}

int main(){

int n;
printf("enter number of time : ");
scanf("%d",&n);
printf("increasing order : ");
increasing(n);
printf("\nDecreasing order : ");
Decreasing(1,n);

    return 0;
}
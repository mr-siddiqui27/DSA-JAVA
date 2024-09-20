#include<stdio.h>

void increasing(int count , int n){
    if(count > n){
        return;
    }
    printf("%d ",count);
    increasing(count+1 , n);
}

void decreasing(int n){
    if(n==0){
        return;
    }
    printf("%d ",n);
    decreasing(n-1);
}

int main(){

int n;
printf("enter number of time : ");
scanf("%d",&n);
printf("increasing order : ");
increasing(1,n);
printf("\ndecreasing order : ");
decreasing(n);

    return 0;
}
#include<stdio.h>

void name(int count , int n){
    if(count == n){
        return;
    }
    printf("Mojammil Husain ! ");
    name(count+1 , n);
}

int main(){

int n;
printf("enter number of time : ");
scanf("%d",&n);
name(0,n);
    return 0;
}
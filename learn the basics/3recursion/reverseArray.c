#include<stdio.h>
void reverseArray(int arr[] , int last, int start){
    if (start>last){
        return;

    }
    int temp=arr[start];
    arr[start]=arr[last];
    arr[last]=temp;    
    reverseArray(arr , last -1, start +1);
}
int main(){
    int n;
    printf("enter size of array: ");
    scanf("%d",&n);
    int arr[n];
    printf("enter elements of array: ");
    for (int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    reverseArray(arr,n-1,0);
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }


    return 0;
}
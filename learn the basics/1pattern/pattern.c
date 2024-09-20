#include<stdio.h>
void pattern3(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){
            printf(" ");
        }
        for(int k=0;k<=i;k++){
            printf("*");
        }
        printf("\n");
    }
}
void pattern4(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            printf(" ");
        }
        for(int k=0;k<n-i;k++){
            printf("*");
        }
        printf("\n");
    }
}
void pattern5(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }

}
void pattern6(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            printf("*");
        }
        printf("\n");
    }

}
void pattern7(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){
            printf(" ");
        }
        for(int k=0;k<2*i+1;k++){
            printf("*");
        }
        for(int l=0;l<n-1-i;l++){
            printf(" ");
        }
        printf("\n");
    }
   


}
void pattern8(int n){
    for (int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            printf(" ");
        }    
        for(int k=0;k<(2*(n-1-i)+1);k++){
            printf("*");
        }    
        for(int l=0;l<i;l++){
            printf(" ");
        }
         
        printf("\n");
    }


}
void pattern9(int n){
    pattern7(n);
    pattern8(n);
}
void pattern10(int n){
    pattern5(n);
    pattern6(n);
}
void pattern11(int n){
    pattern3(n);
    pattern4(n);
}
void pattern12(int n){
    int a;
    for(int i=1;i<=n;i++){
        if (i%2==0){
            a=0;
        }
        else{
            a=1;
        }
        for(int j=1;j<=i;j++){
            printf("%i",a);
            a=1-a;
        }
        printf("\n");
    }

}
void pattern13(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            printf("%i",j);
        }
        for(int k=1;k<=2*n-2*i;k++){
            printf(" ");
        }
        for(int l=i;l>=1;l--){
            printf("%i",l);
        }
        printf("\n");
    }
}
void pattern14(int n){
    char alpha[13]={'A','B','C','D','E','F','G','H','K','L','M','N','0'};
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            printf("%c",alpha[j]);
        }
        printf("\n");
    }
}
void pattern15(int n){
    char alpha[13]={'A','B','C','D','E','F','G','H','K','L','M','N','0'};
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            printf("%c",alpha[j]);
        }
        printf("\n");
    }
}
void pattern16(int n){
    char alpha[13]={'A','B','C','D','E','F','G','H','K','L','M','N','0'};
    for(int i=0;i<n;i++){
        for(int j=i;j>=0;j--){
            printf("%c",alpha[n-1-j]);
        }
        printf("\n");
    }
}
void pattern17(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
}
void pattern18(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            
        }
    }
}
int main(){
     
    
pattern17(5);
    return 0;
}
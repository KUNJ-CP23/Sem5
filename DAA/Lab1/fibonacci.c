#include <stdio.h>
int fibonacci_recur(int n){
    if(n<=1) return n;
    return fibonacci_recur(n-1)+fibonacci_recur(n-2);
}

int fibonacci_ite(int n){
    int a=0, b=1,c;
    for(int i=0;i<n;i++){
        printf("%d ",a);
        c=a+b;
        a=b;
        b=c;
    }
}

void main(){
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    printf("\nFibonacci (Iterative): ");
    fibonacci_ite(n);

    printf("\nFibonacci (Recursive): ");
    for(int i = 0; i < n; i++) {
        printf("%d ", fibonacci_recur(i));
    }
}
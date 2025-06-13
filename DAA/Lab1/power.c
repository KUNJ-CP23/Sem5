#include<stdio.h>
int power_recur(int a,int n){
    if(n==0) return 1;
    return a*power_recur(a,n-1);
}

int power_ite(int a, int n){
    int ans=1;
    for(int i=0;i<n ; i++){
        ans*=a;
    }
    return ans;
}

int main() {
    int a, n;
    printf("Enter base (a) and exponent (n): ");
    scanf("%d %d", &a, &n);

    printf("a^n (Iterative): %d\n", power_ite(a, n));
    printf("a^n (Recursive): %d\n", power_recur(a, n));

    return 0;
}
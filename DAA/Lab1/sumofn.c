#include <stdio.h>

int sum_recur(int n) {
    if(n == 0) return 0;
    return n + sum_recur(n - 1);
}
int sum_ite(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

int main() {
    int n;
    printf("Enter value of n: ");
    scanf("%d", &n);

    printf("Sum of first n numbers (Iterative): %d\n", sum_ite(n));
    printf("Sum of first n numbers (Recursive): %d\n", sum_recur(n));

    return 0;
}

#include <stdio.h>

int cnt_recur(int n) {
    if(n == 0) return 0;
    return 1 + cnt_recur(n / 10);
}

int cnt_ite(int n) {
    int count = 0;
    while (n!=0){
        count++;
        n /= 10;
    }
    return count;
}

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Digit Count (Ite): %d\n", cnt_ite(n));
    printf("Digit Count (Recur): %d\n", cnt_recur(n));

    return 0;
}

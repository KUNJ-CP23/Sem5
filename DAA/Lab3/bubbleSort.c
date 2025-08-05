#include <stdio.h>
#include <time.h>

void bubble_sort(int arr[],int n){
    int i=0,j=0,swapped=0;
     for(int i=0;i<n;i++){
        swapped = 0;
        for(int j=1;j<n-i;j++){
            if(arr[j-1] > arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               swapped = 1;
            }
        }
    }
}

void main(){
    int i=0;
    FILE* file;
    clock_t start,end;
    double cpu_time_used;
    int n = 100000;
    int arr[n];

    //worst case
    file = fopen("worst_case_10000.txt","r");
    for(i=0;i<n;i++){
        fscanf(file,"%d",&arr[i]);
    }
    fclose(file);

    start = clock();
    bubble_sort(arr,n);
    end = clock();
    cpu_time_used = ((double)(end - start)/CLOCKS_PER_SEC);
    printf("Time taken to Sot Array Using Bubble Sort in Worst Case is : %f",cpu_time_used);
}
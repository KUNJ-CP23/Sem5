import java.util.*;

public class array_sort3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        
        //BUbble
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println("Your sorted array is: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
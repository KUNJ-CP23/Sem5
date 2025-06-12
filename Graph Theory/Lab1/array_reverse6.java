import java.util.*;

public class array_reverse6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int j=n-1;
        for(int i=0 ;i<n/2 ; i++){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
        }
        System.out.println("Your reversed array is: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
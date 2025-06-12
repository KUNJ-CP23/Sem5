import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
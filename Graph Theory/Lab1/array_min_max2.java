import java.util.*;

public class array_min_max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter elements");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
        sc.close();
    }
}
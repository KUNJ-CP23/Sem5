import java.util.*;

public class array_2d_add5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the rows and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat1[][] = new int [n][m];
        int mat2[][] = new int [n][m];

        System.out.println("Enter elements for mat1");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for mat2");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your elements are : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.println(mat1[i][j] + mat2[i][j]+"   ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
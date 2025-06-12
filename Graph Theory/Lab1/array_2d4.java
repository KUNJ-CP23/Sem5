import java.util.*;

public class array_2d4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int [n][m];

        System.out.println("Enter elements");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print elements");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
               System.out.print(mat[i][j]+"   ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
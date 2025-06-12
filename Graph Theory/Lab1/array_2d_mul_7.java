// import java.util.*;

// public class array_2d_mul_7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int mat1[][] = new int [3][3];
//         int mat2[][] = new int [3][3];
//         System.out.println("Enter elements for mat1");
//         for(int i=0 ; i<3 ; i++){
//             for(int j=0 ; j<3 ; j++){
//                 mat1[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter elements for mat2");
//         for(int i=0 ; i<3 ; i++){
//             for(int j=0 ; j<3 ; j++){
//                 mat2[i][j] = sc.nextInt();
//             }
//         }
//         int ans[][] = new int [3][3];
//         for(int i=0 ; i<3; i++){
//             for(int j=0 ; j<3 ; j++){
//                 for(int k=0; k<3 ; k++){
//                     ans[i][j] += mat1[i][k] * mat2[k][j];
//                 }
//             }
//         }
//         System.out.println("Matrix Multiplication");
//         for(int i=0 ; i<3 ; i++){
//             for(int j=0 ; j<3 ; j++){
//                System.out.print(ans[i][j]+"   ");
//             }
//             System.out.println("\n");
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class array_2d_mul_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of Matrix 1: ");
        int n1 = sc.nextInt();
        int m1 = sc.nextInt(); 

        System.out.print("Enter rows and columns of Matrix 2: ");
        int n2 = sc.nextInt(); 
        int m2 = sc.nextInt(); 

        if (m1 != n2) {
            System.out.println("Matrix multiplication not possible! (Columns of Matrix 1 must equal rows of Matrix 2)");
        }

        int[][] mat1 = new int[n1][m1];
        int[][] mat2 = new int[n2][m2];
        int[][] ans = new int[n1][m2];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

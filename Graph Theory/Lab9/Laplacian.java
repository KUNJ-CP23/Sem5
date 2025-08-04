import java.util.*;

public class Laplacian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int n = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        int[][] adj = new int[n][n];

        System.out.println("Enter edges (u v) for each edge:");
        for(int i=0;i<m;i++){
            for(int j=0 ; j<2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //zero based and adjacency matrix
        for(int i=0;i<m;i++){
            int u = arr[i][0]- 1;
            int v = arr[i][1]- 1;
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        System.out.println("Adjacency Matrix:");
        for (int[] row : adj) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        //degree matrix
        int[][] degree = new int[n][n];
        for(int i=0;i<n;i++){
            int degreeCount = 0;
            for(int j=0;j<n;j++){
                if(adj[i][j] == 1){
                    degreeCount++;
                }
            }
            degree[i][i] = degreeCount;
        }

        System.out.println("Degree Matrix:");
        for (int[] row : degree) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        //m-1 laplacian matrix
        int[][] laplacian = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    laplacian[i][j] = degree[i][i];
                } else {
                    laplacian[i][j] = -adj[i][j];
                }
            }
        }

        // m-2 laplacian = adj - degree
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         laplacian[i][j] = degree[i][j] - adj[i][j];
        //     }
        // }

        System.out.println("Laplacian Matrix:");

        for (int[] row : laplacian) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
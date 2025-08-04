import java.util.*;

public class Adjacency {
    // public static void edgeAddkaro(int[][] arr, int i, int j){
    //     arr[i][j] = 1;
    //     arr[j][i] = 1;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: N = 5, M = 4, arr[][] = { { 1, 2 }, { 2, 3 }, { 4, 5 }, { 1, 5 } }
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
        sc.close();
    }
}
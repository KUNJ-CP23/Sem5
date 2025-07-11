import java.util.*;

public class friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];

        System.out.println("Enter elements:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        boolean[] visited = new boolean[n];
        int cnt = 0;

        for (int i=0;i<n;i++) {
            if (!visited[i]) {
                dfs(mat, i, visited);
                cnt++;
            }
        }

        System.out.println("Groups: " +cnt);
        sc.close();
    }

    private static void dfs(int[][] mat, int node, boolean[] visited) {
        Stack<Integer> st = new Stack<>();
        st.push(node);
        visited[node] = true;

        while (!st.isEmpty()) {
            int current = st.pop();
            for (int j = 0; j < mat.length; j++) {
                if (mat[current][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    st.push(j);
                }
            }
        }
    }
}

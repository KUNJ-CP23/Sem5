
import java.util.*;

public class dfs_recur {
    //static so that I can use wherever i want to ;)
    static List<Integer>[] adj;
    static boolean[] visited;
    static List<Integer> ans;

    public static void dfs(int node) {
        visited[node] = true;
        ans.add(node);

        for (int i : adj[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] ad = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};

        adj = new ArrayList[ad.length];
        visited = new boolean[ad.length];
        ans = new ArrayList<>();

        for (int i = 0; i < ad.length; i++) {
            adj[i] = new ArrayList<>();
            for (int val : ad[i]) {
                adj[i].add(val);
            }
        }
        
        dfs(0); 
        System.out.println(ans);
    }
}

// Collections.sort(adj[i]);
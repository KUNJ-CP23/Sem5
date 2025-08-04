import java.util.*;

public class graph_bfs {
    public static void main(String[] args) {
        int adj[][] = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};

        Queue<Integer> q = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        boolean[] visited = new boolean[adj.length];

        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            li.add(node);
            //for bfs, will check the neighbor node
            for (int neighbor : adj[node]) {
                //if not visited then set visited true
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    //now its visited atle add it to queue
                    q.offer(neighbor);
                }
            }
        }
        System.out.println(li);
    }
}

// import java.util.*;

// public class CutVertices {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //number of vertices
//         //int n = sc.nextInt();

//         //static data
//         int graph[][] = {{1},{0,2},{1,3,4},{2},{2}};
//         int n = graph.length;
//         boolean[] visited = new boolean[n];
//         Arrays.fill(visited, false);    

//         //using dfs
//         for(int i=0;i<n;i++){
//             if(!visited[i]){
//                 dfs(graph, visited, graph[i]);
//             }
//         }
//         sc.close();
//     }
//     public static void dfs(int graph[][], boolean[] visited, int start[]){
//         Stack<Integer> st = new Stack<>();
//         List<Integer> li = new ArrayList<>();
//         st.push(start[0]);
//         visited[start[0]] = true;
//         while (!st.isEmpty()) {
//             int node = st.pop();
//             li.add(node);
//             for(int i : graph[node]){
//                 if(!visited[i]){
//                     visited[i]=true;
//                     st.push(i);
//                 }
//             }
//         }
//         if(li.size()!=graph.length){
//             System.out.println("This is cut vertex" + graph[li.get(0)]);
//         }
//         else{
//             System.out.println("This is not cut vertex" + li);
//         }
//     }
// }


// Java program to find articulation points
// using a naive DFS approach

import java.util.*;
//GFG
class CutVertices {

    // Standard DFS to mark all reachable nodes
    static void dfs(int node,
    ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }

    // Builds adjacency list from edge list
    static ArrayList<ArrayList<Integer>> constructadj(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }

    // Finds articulation points using naive DFS approach
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = constructadj(V, edges);
        ArrayList<Integer> res = new ArrayList<>();

        // Try removing each node one by one
        for (int i = 0; i < V; ++i) {
            boolean[] visited = new boolean[V];
            visited[i] = true;

            // count DFS calls from i's neighbors
            int comp = 0;
            for (int it : adj.get(i)) {

                // early stop if already more than 1 component
                if (comp > 1) break;

                if (!visited[it]) {

                    // explore connected part
                    dfs(it, adj, visited);
                    comp++;
                }
            }

            // if more than one component forms, it's an articulation point
            if (comp > 1)
                res.add(i);
        }

        if (res.isEmpty())
            return new ArrayList<>(Arrays.asList(-1));

        return res;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0, 1}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};

        ArrayList<Integer> ans = articulationPoints(V, edges);
        System.out.print("Articulation points in the graph: ");
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
}
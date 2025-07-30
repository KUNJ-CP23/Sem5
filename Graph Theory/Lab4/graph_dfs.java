import java.util.*;

public class graph_dfs {
    public static void main(String[] args) {
        int adj[][] = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};

        Stack<Integer> st = new Stack<>();
        List<Integer> li = new ArrayList<>();
        boolean[] visited = new boolean[adj.length];

        st.push(0);
        visited[0] = true;

        while (!st.isEmpty()) {
            int node = st.pop();
            li.add(node);

            //for normal traversal in non-sequential order
            // [0, 2, 1, 3, 4]

            for(int i : adj[node]){
                if(!visited[i]){
                    visited[i]=true;
                    st.push(i);
                }
            }
        }

            //for sequential order
            // [0, 1, 3, 4, 2]

            // for(int i=adj[node].length-1;i>=0;i--){
            //     if(!visited[adj[node][i]]){
            //         visited[adj[node][i]]=true;
            //         st.push(adj[node][i]);
            //         // System.out.println(adj[node][i]);
            //     }
            // }



        System.out.println(li);

    }
}


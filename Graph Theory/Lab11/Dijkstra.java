import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] edges= {{0,1,4},{0,2,2},{1,4,1},{1,3,1},{2,3,1},{3,4,4},{3,5,5},{2,5,3}};
        
        //n->vertices
        int n = 6;
        int source=0;
        int dist[] = new int[n];
        
        //filling array with infinity i.e. max value of int
        Arrays.fill(dist, Integer.MAX_VALUE);

        //source fixed
        dist[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{source,0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int u = curr[0];
            
            for(int[] edge: edges){
                //edge[0] -> u, edge[1] -> v, edge[2] -> weight
                if(edge[0] == u){
                    int v = edge[1];
                    int weight = edge[2];
                    if(dist[u]+weight < dist[v]){
                        dist[v] = dist[u]+weight;
                        pq.add(new int[]{v,dist[v]});
                    }
                }
            }
        }
        
        System.out.println("The shortest distance from source node to all other nodes is:");
        for(int i=0;i<n;i++){
            System.out.println("Node "+i+" is at distance "+dist[i]);
        }   
        sc.close();
    }
}

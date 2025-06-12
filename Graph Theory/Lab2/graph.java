
import java.util.*;

public class graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //below is 3rd perfect working using arraylist iterating array

        System.out.println("Enter the number of edges: ");
        int n=sc.nextInt();

        int arr[][]= new int[n][2];
        System.out.println("Enter edges (from-->to) : ");
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxVertex = 0;
        for(int i=0 ; i<n ; i++){
            maxVertex = Math.max(maxVertex, Math.max(arr[i][0], arr[i][1]));
        }

        ArrayList<Integer>[] grp = new ArrayList[maxVertex+1];
        // grp[0], grp[1], grp[2], grp[3]   index 0 to maxVertex - 1
        // create an ArrayList for each vertex
        for(int i=0 ; i<=maxVertex; i++){
            grp[i] = new ArrayList<>();
        }

        //fill adjacency list
        for(int i=0 ; i<n ; i++){
            grp[arr[i][0]].add(arr[i][1]);
        }

        System.out.println("Mapping is : ");
        for(int i=0 ; i<=maxVertex ; i++){
            if(grp[i].size()>0){
                System.out.print(i + " -> ");
                //grp[i] aavse so that a tya 0th index vada badha lay lye
                for(int val: grp[i]){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }




        //below is 2nd perfect running using hashmap

        // int arr[][] = {{0,1},{0,2},{1,2},{1,3},{2,3},{3,1}};
        // Map<Integer,StringBuilder> mp = new HashMap<>();
        // for(int i=0 ; i<arr.length ; i++){
        //     mp.putIfAbsent(arr[i][0], new StringBuilder());
        //     mp.get(arr[i][0]).append(arr[i][1]+" ");
        // }
        // for(Map.Entry<Integer,StringBuilder> k : mp.entrySet()){
        //     System.out.println(k.getKey()+ " -> " + k.getValue());
        // }


        //below is the first trial

        // for(int i=0 ; i<arr.length-1 ; i++){
        //     // if(arr[i][0] == arr[i+1][0]+1)
        //     System.out.print(arr[i][0]+" -> ");
        //     StringBuilder sb = new StringBuilder();
        //     sb.append(arr[i][1] + " ");
        //     if(arr[i][0] == arr[i+1][0]){
        //         sb.append(arr[i+1][0]);
        //         i++;
        //     }
        //     for(int j=0 ; j<arr[0].length ;j++){
        //         sb.append(arr[i][1]);
        //         sb.append(" ");
        //     }
        //     System.out.println(sb.toString());
        //     // System.out.print(arr[i][0]+" -> ");
        //     // StringBuilder sb1 = new StringBuilder();
        //     // sb1.append(arr[i][1] + " ");
        //     // System.out.println(sb1.toString());
        // }

        
        sc.close();
    }
}


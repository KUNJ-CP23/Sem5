import java.util.*;

public class adj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //below is 2nd perfect running using hashmap

        int arr[][] = {{0,1},{0,2},{1,2},{1,3},{2,3},{3,1}};
        Map<Integer,StringBuilder> mp = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            mp.putIfAbsent(arr[i][0], new StringBuilder());
            mp.get(arr[i][0]).append(arr[i][1]+" ");
        }
        for(Map.Entry<Integer,StringBuilder> k : mp.entrySet()){
            System.out.println(k.getKey()+ " -> " + k.getValue());
        }

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
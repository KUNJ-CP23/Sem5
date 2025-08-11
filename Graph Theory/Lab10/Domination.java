//not done yet

import java.util.*;

public class Domination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input: N = 4, M = 4, arr[][] = {{ 1, 2 }, { 1, 3 }, { 3, 4 }, { 2, 4 }}  
        
        // System.out.println("Enter number of verices: ");
        // int n = sc.nextInt();
        // System.out.println("Enter number of edges: ");
        // int m = sc.nextInt();

        // int[][] arr = new int[m][2];
        
        // System.out.println("Enter the edges (u v) format: ");
        // for (int i = 0; i < m; i++) {
        //     arr[i][0] = sc.nextInt();
        //     arr[i][1] = sc.nextInt();
        // }
        int n=4;
        int m=4;
        int[][] arr = {{1, 2}, {1, 3}, {3, 4}, {2, 4}};
        boolean[] visited = new boolean[n + 1];
        ArrayList<ArrayList<Integer>> allsets = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        //generating all sets
        // (1),(1,2),(1,3),(1,4),(1,2,3),(1,2,4),(2),(2,3),(2,4),(2,3,4),(3),(3,4),(4),(1,2,3,4)

        //single elements list
        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> singleElementSet = new ArrayList<>();
            singleElementSet.add(i);
            allsets.add(singleElementSet);
        }
        //two elements list
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ArrayList<Integer> twoElementSet = new ArrayList<>();
                twoElementSet.add(i);
                twoElementSet.add(j);
                allsets.add(twoElementSet);
            }
        }
        //three elements list
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    ArrayList<Integer> threeElementSet = new ArrayList<>();
                    threeElementSet.add(i);
                    threeElementSet.add(j);
                    threeElementSet.add(k);
                    allsets.add(threeElementSet);
                }
            }
        }
        allsets.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));

        System.out.println("All generated sets: " + allsets);
        
        for(ArrayList<Integer> set : allsets) {
            if(isDominatingSet(arr, n, allsets, set)) {
                result.add(set);
            }
        }
        System.out.println("All dominating sets: " + result);

        sc.close();
    }
    public static boolean isDominatingSet(int[][] arr, int n, ArrayList<ArrayList<Integer>> allsets, ArrayList<Integer> sets) {
        for(int i : sets) {
        }
        return true;
    }
}
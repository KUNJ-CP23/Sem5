import java.util.*;

public class adj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // below is 3rd perfect working using arraylist iterating array

        System.out.println("Enter the number of edges: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][2];
        System.out.println("Enter edges (from-->to) : ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int maxVertex = 0;
        for (int i = 0; i < n; i++) {
            maxVertex = Math.max(maxVertex, Math.max(arr[i][0], arr[i][1]));
        }

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] grp = (ArrayList<Integer>[]) new ArrayList[maxVertex + 1];

        // grp[0], grp[1], grp[2], grp[3] index 0 to maxVertex - 1
        // create an ArrayList for each vertex
        for (int i = 0; i <= maxVertex; i++) {
            grp[i] = new ArrayList<>();
        }

        // fill adjacency list
        for (int i = 0; i < n; i++) {
            grp[arr[i][0]].add(arr[i][1]);
        }

        System.out.println("Mapping is : ");
        for (int i = 0; i <= maxVertex; i++) {
            if (grp[i].size() > 0) {
                System.out.print(i + " -> ");
                // grp[i] aavse so that a tya 0th index vada badha lay lye
                for (int val : grp[i]) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

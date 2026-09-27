package Dsa_Java.src.Graph.Topo_Sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class by_topo_cycle_det_directed {

    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        // Build adjacency list and calculate indegree
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // Add vertices with indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int count = 0;

        // Perform BFS using Kahn's Algorithm
        while (!q.isEmpty()) {

            int node = q.poll();
            count++;

            for (int neighbor : adj.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        // If all vertices are processed, no cycle exists
        return count != V;
    }

    public static void main(String[] args) {

        by_topo_cycle_det_directed obj = new by_topo_cycle_det_directed();

        // Graph Visualization:
        //
        //       0 ─────> 1
        //       ^        |
        //       |        v
        //       3 <───── 2
        //
        // Directed Cycle: 0 -> 1 -> 2 -> 3 -> 0
        //
        // Topological Sort is not possible because a cycle exists.

        int V = 4;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0}
        };

        boolean result = obj.isCyclic(V, edges);

        System.out.println("Cycle Exists: " + result);
    }
}
package Dsa_Java.src.Graph.Topo_Sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class by_topo_cycle_det_undirected_graph {

    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Build adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Check every component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean bfs(int start, ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{start, -1});
        visited[start] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int node = curr[0];
            int parent = curr[1];

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        by_topo_cycle_det_undirected_graph obj =
                new by_topo_cycle_det_undirected_graph();

        // Graph Visualization:
        //
        //       0 -------- 1
        //       |          |
        //       |          |
        //       3 -------- 2
        //
        // Cycle: 0 -> 1 -> 2 -> 3 -> 0
        //
        // Since the graph contains a cycle, the output is true.

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
package lab4;

import java.util.*;


public class dijkstra {

    static final int INF = Integer.MAX_VALUE;

    public static int[] dijkstraAlgo(int[][] graph, int src) {
        int n = graph.length;

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Min-heap: (distance, node)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int u = top[1];

            if (visited[u]) continue;
            visited[u] = true;

            // Check all vertices v
            for (int v = 0; v < n; v++) {
                if (graph[u][v] == INF) continue;

                // Relaxation step
                if (dist[v] > dist[u] + graph[u][v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pq.add(new int[]{dist[v], v});
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {

        int INF = Integer.MAX_VALUE;

        // Sample graph (Adjacency matrix)
        int[][] graph = {
                {0, 4, INF, 8, INF},
                {4, 0, 2, INF, INF},
                {INF, 2, 0, 1, 3},
                {8, INF, 1, 0, 2},
                {INF, INF, 3, 2, 0}
        };

        int src = 0;

        int[] result = dijkstraAlgo(graph, src);

        System.out.println("Shortest distances from source " + src + ":");
        System.out.println(Arrays.toString(result));
    }
}

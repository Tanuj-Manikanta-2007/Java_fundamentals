package Desing_algorithm_analysis.src.lab4;

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

    public static class coin_change {
        public static void main(String[] args){
            int change[] = {5,10,1};
            int amt = 68;
            int res[] = Coin_Change(change,amt);
            System.out.println("Result max profit by greddy : ");
            int pro = 0;
            for(int i = 0;i < res.length;i++){
                if(res[i] != 0){
                    System.out.println(change[i] + " *  " + res[i]);
                }

            }
            System.out.println(Arrays.toString(res));
        }
        static int[] Coin_Change(int d[],int amt){
            int x[] = new int[d.length];
            System.out.println(Arrays.toString(d));
            descending(d);
            System.out.println(Arrays.toString(d));
            for(int i = 0;i < d.length;i++){
                if(amt >= d[i]){
                    x[i] = amt/d[i];
                    amt = amt - x[i] * d[i];
                }
            }
            return x;
        }
        static void descending(int arr[]){
            Arrays.sort(arr);
            int s = 0;
            int e = arr.length-1;
            while(s < e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }


    }
}

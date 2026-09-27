package Desing_algorithm_analysis.src.lab4;
import java.util.*;
public class Dijkstra_algo {
    static class Pair{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    public static int[] dijkstra(int V,ArrayList<ArrayList<Pair>> adj,int src){
        PriorityQueue<Pair> pq = new PriorityQueue<> ((x,y) -> x.distance - y.distance);
        int dist[]  = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            for(Pair next : adj.get(u)){
                int v = next.node;
                int weight = next.distance;
                if(dist[v] > dist[u] + weight){
                    dist[v] = dist[u] + weight;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0;i < V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(2, 1));
        adj.get(1).add(new Pair(3, 7));
        adj.get(2).add(new Pair(4, 3));
        adj.get(3).add(new Pair(4, 1));
        int res[] = dijkstra(V,adj,0);
        for(int i = 0;i < res.length;i++){
            System.out.println("Node " + i + " : " + res[i]);
        }
    }
}

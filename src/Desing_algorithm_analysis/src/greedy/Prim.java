package Desing_algorithm_analysis.src.greedy;
import java.util.*;
public class Prim {
    static class Pair{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }

    public static int prim(ArrayList<ArrayList<Pair>> adj,int V){
        boolean[] visited = new boolean[V];
        ArrayList<Pair> list = new ArrayList<>();
        int sumn = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance-y.distance);
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int u = current.node;
            if(visited[u]) continue;
            list.add(new Pair(u,current.distance));
            visited[u] = true;
            sumn += current.distance;

            for(Pair next : adj.get(u)){
                int v = next.node;
                if(!visited[v]){
                    pq.add(new Pair(v,next.distance));
                }
            }
        }
        for(Pair next : list){
            System.out.println(next.node + "  " + next.distance);
        }
        return sumn;
    }

    public static void main(String[] args){
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<> ();
        for(int i = 0;i < V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(0, 2));

        adj.get(0).add(new Pair(2, 4));
        adj.get(2).add(new Pair(0, 4));

        adj.get(1).add(new Pair(2, 1));
        adj.get(2).add(new Pair(1, 1));

        adj.get(1).add(new Pair(3, 7));
        adj.get(3).add(new Pair(1, 7));

        adj.get(2).add(new Pair(4, 3));
        adj.get(4).add(new Pair(2, 3));

        adj.get(3).add(new Pair(4, 1));
        adj.get(4).add(new Pair(3, 1));
        int pro = prim(adj,V);
        System.out.println("Minimum spanning tree cost : " + pro);
    }
}

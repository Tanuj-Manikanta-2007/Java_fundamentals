package dynamic_programming;
import java.util.*;
// dfs is one off the traversal algarithms used for graphs in we use travels to the last possible node brfore backtracking
public class depth_first_search {
    public static void main(String[] args){
        int size = 8;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i  = 0;i < size;i++ ){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);
        adj.get(2).add(5);
        adj.get(5).add(7);
        adj.get(3).add(6);

        boolean visited[] = new boolean[size];

        dfs(1,adj,visited);
        System.out.println();
        dfs_stack(1,adj);
    }
    static void dfs(int v,List<List<Integer>> adj,boolean[] visited){
        visited[v] = true;
        System.out.print(v + "  ");
        for(int edge : adj.get(v)){
            if(!visited[edge]){
                dfs(edge,adj,visited);
            }
        }
    }
    static void dfs_stack(int v,List<List<Integer>> adj){
        Stack<Integer> stack = new Stack <>();
        stack.push(v);
        boolean visited[] = new boolean[adj.size()];
        while(!stack.isEmpty()){
            int node = stack.pop();
            System.out.print(node + " ");
            for(int edge : adj.get(node)){
                if(!visited[edge]){
                    stack.push(edge);
                    visited[edge] = true;
                }
            }
        }
    }
}

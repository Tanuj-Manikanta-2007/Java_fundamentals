package Dsa_Java.src.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Breadth_first_search {

    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    bfs(i, j, visited, grid, m, n);
                }
            }
        }

        return count;
    }

    public void bfs(int r, int c, boolean[][] visited,
                    char[][] grid, int m, int n) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{r, c});
        visited[r][c] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int row = curr[0];
            int col = curr[1];

            for (int i = 0; i < 4; i++) {

                int nx = row + dx[i];
                int ny = col + dy[i];

                if (nx >= 0 && nx < m &&
                        ny >= 0 && ny < n &&
                        !visited[nx][ny] &&
                        grid[nx][ny] == '1') {

                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }

    // Method to print the graph
    public void printGraph(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Breadth_first_search obj = new Breadth_first_search();

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println("Graph:");
        obj.printGraph(grid);

        int result = obj.numIslands(grid);

        System.out.println("\nNumber of Islands: " + result);
    }
}


// Graph Visualization:
//
//  1 ── 1   0   0   0
//  │    │
//  1 ── 1   0   0   0
//
//  0   0   1   0   0
//          (Island 2)
//
//  0   0   0   1 ── 1
//                  (Island 3)
//
// Total Islands = 3
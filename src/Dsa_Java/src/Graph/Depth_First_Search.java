package Dsa_Java.src.Graph;

public class Depth_First_Search {

    private int[] dx = {-1, 0, 0, 1};
    private int[] dy = {0, -1, 1, 0};

    public int numEnclaves(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] visited = new int[m][n];

        // Start DFS from boundary land cells

        for (int i = 0; i < n; i++) {

            if (visited[0][i] == 0 && grid[0][i] == 1) {
                dfs(0, i, visited, grid);
            }

            if (visited[m - 1][i] == 0 && grid[m - 1][i] == 1) {
                dfs(m - 1, i, visited, grid);
            }
        }

        for (int i = 0; i < m; i++) {

            if (visited[i][0] == 0 && grid[i][0] == 1) {
                dfs(i, 0, visited, grid);
            }

            if (visited[i][n - 1] == 0 && grid[i][n - 1] == 1) {
                dfs(i, n - 1, visited, grid);
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int r, int c, int[][] visited, int[][] grid) {

        visited[r][c] = 1;

        for (int i = 0; i < 4; i++) {

            int nx = r + dx[i];
            int ny = c + dy[i];

            if (nx >= 0 && nx < visited.length &&
                    ny >= 0 && ny < visited[0].length &&
                    visited[nx][ny] == 0 && grid[nx][ny] == 1) {

                dfs(nx, ny, visited, grid);
            }
        }
    }

    public static void main(String[] args) {

        Depth_First_Search obj = new Depth_First_Search();

        // Graph Visualization:
        //
        //  0  0  0  0  0
        //  0  1  1  0  0
        //  0  0  1  0  0
        //  0  0  0  0  0
        //
        //  Enclosed Island:
        //
        //       1 ── 1
        //            |
        //            1
        //
        //  Boundary-connected land is excluded from the count.
        //  Only land cells that cannot reach the boundary are counted.

        int[][] grid = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int result = obj.numEnclaves(grid);

        System.out.println("Number of Enclaves: " + result);
    }
}
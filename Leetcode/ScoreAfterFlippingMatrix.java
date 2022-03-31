//Problem Statement: https://leetcode.com/problems/score-after-flipping-matrix/
public class ScoreAfterFlippingMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0}};
        System.out.println(matrixScore(arr));
    }
    static int matrixScore(int[][] grid) {
        int N = grid.length,
                M = grid[0].length;

        for (int i = 0; i < N; ++i) {
            if (grid[i][0] == 0)
                flipRow(grid, i);
        }

        for (int col = 1; col < M; ++col) {
            int sumCol = 0;
            for (int i = 0; i < N; ++i)
                sumCol += grid[i][col];

            if (sumCol * 2 < N)
                flipCol(grid, col);
        }

        int total = 0;
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < M; ++j)
                total += grid[i][j] * (1 << (M-j-1));

        return total;
    }
    static void flipRow(int[][] a, int r) {
        for (int i = 0; i < a[r].length; ++i)
            a[r][i] = (a[r][i] ^ 1);
    }
    static void flipCol(int[][] a, int c) {
        for (int i = 0; i < a.length; ++i)
            a[i][c] = (a[i][c] ^ 1);
    }
}

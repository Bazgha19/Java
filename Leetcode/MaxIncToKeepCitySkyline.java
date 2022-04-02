//Problem Statement: https://leetcode.com/problems/max-increase-to-keep-city-skyline/
public class MaxIncToKeepCitySkyline {
    public static void main(String[] args) {
        int[][] arr = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(arr));
    }
    static int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid == null)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        int maxrow[] = new int[n];
        int maxcol[] = new int[m];
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++){
                maxrow[i] = Math.max(maxrow[i], grid[i][j]);
                maxcol[j] = Math.max(maxcol[j], grid[i][j]);
            }
        int ans = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++)
                ans += (Math.min(maxrow[i], maxcol[j]) - grid[i][j]);

        return ans;
    }
}

//Problem Statement: https://leetcode.com/problems/search-a-2d-matrix/
public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {34,65,76},
                {80,90,100} };
        int target = 100;
        System.out.println(searchMatrix(arr, target));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return true;
            }
            if (matrix[r][c] < target){
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}

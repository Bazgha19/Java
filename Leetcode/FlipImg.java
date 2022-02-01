//https://leetcode.com/problems/flipping-an-image/

public class FlipImg {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},{1,0,1},{0,0,0}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int row = arr.length;
        int col = arr[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i
                ++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = arr[i][arr.length-j-1];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = (res[i][j] == 1)?0:1;
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }
    }

}

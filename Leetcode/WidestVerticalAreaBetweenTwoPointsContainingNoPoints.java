//Problem Statement: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public static void main(String[] args) {
        int[][] arr = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(arr));
    }
    static int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int arr[] = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);

        int ans = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            if( (arr[i] - arr[i-1]) > ans){
                ans = arr[i]-arr[i-1];
            }
        }
        return ans;
    }
}

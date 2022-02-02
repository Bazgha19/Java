//https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{3,2,4},{6,55}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum+accounts[i][j];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return ans;
    }


}

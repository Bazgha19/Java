import java.util.Arrays;

//Problem Statement: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
public class MinimumOperationToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String boxes = "110";
        System.out.println(Arrays.toString(minOperations(boxes)));
    }
    static int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int count = boxes.charAt(0) - '0';
        for(int i = 1 ; i < n ; i++){
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
        }

        count = boxes.charAt(n - 1) - '0';
        for(int i = n - 2 ; i >=0 ; i--){
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
        }

        for(int i = 0 ; i < n ; i++) {
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}

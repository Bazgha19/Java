//Problem Statement: https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

public class SquaresofSortedArr {
    public static void main(String[] args) {
        int[] arr = {-12,4,5,-10,8};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}

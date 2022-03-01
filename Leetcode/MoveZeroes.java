//Problem Statement: https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,23,43,48,0};
        moveZeroes(arr);
    }

    static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

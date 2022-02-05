//Problem Statement: https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println(createTargetArray(arr, index));
    }
    static List<Integer> createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i],nums[i]);
        }
        return ans;
    }
}

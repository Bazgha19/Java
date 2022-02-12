//Problem Statement: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,3,3,3,3,3,44,50,50,50,50,50,50,50,57,59};
        int target = 50;
        searchRange(arr, target);
    }

    static void searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = searchIndex(nums,target,true);
        int last = searchIndex(nums,target,false);
        ans[0] = start;
        ans[1] = last;
        System.out.println(Arrays.toString(ans));
    }

    static int searchIndex(int[] nums, int target, boolean firstIndex){
        int ans = -1;
        int start=0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<nums[mid]){
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if (firstIndex){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

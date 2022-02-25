//Problem Statement: https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofArr {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5};
        int[] nums2 = {3,5};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));


    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> intersection = new HashSet<>();
        for(int num: nums2){
            if(binarySearch(num, nums1))
                intersection.add(num);
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for(int num: intersection){
            result[i] = num;
            i++;
        }
        return result;
    }

    static boolean binarySearch(int target, int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target){
                end = mid - 1;
            }else
                start = mid + 1;
        }
        return false;
    }
}

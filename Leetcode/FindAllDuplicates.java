//Problem Statement: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i]!= nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                res.add(nums[index]);
            }
        }

        return res;

    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

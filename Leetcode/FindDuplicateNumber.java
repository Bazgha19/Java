//Problem Statement: https://leetcode.com/problems/find-the-duplicate-number

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if (nums[i]!= i+1){
                int correct = nums[i] - 1;
                if (nums[i]!= nums[correct]){
                    swap(nums, i, correct);
                } else{
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

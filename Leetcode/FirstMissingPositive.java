//Problem Statement: https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i]>0 && nums[i] <= nums.length && nums[i]!= nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

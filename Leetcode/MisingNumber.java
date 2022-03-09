//Problem Statement: https://leetcode.com/problems/missing-number/
public class MisingNumber {
    public static void main(String[] args) {
       int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i]!= nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

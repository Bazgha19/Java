//Problem Statement: https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <nums.length ; j++) {
                if (i<j){
                    if (nums[i]==nums[j]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

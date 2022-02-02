//Problem Statement: https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));
    }

    static int[] runningSum(int[] nums){
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i-1]+nums[i];
        }
        return res;
    }

//    static void runningSum2(int[] nums) {
//        int a = nums[0];
//        System.out.print(a);
//        for (int i = 1; i < nums.length; i++) {
//            int b = a + nums[i];
//            System.out.print(" "+b);
//            a = b;
//        }
//    }
}

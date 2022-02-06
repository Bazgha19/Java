//Problem Statement: https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;
public class ArrPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        buildArray(nums);
    }
    static void buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(res));
    }
}

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3,9,0};
        int n = 9;
        twoSum(nums,n);

    }
    static void twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

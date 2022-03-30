import java.util.Arrays;

//Problem Statement: https://leetcode.com/problems/rearrange-array-elements-by-sign/
public class RearrangeArrElement {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int index_result = 0;
        int index_positive = -1;
        int index_negative = -1;

        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                index_positive++;
                while(nums[index_positive] <0 )index_positive++;
                ans[index_result++] = nums[index_positive];
            }
            else{
                index_negative++;
                while(nums[index_negative] > 0 )index_negative++;
                ans[index_result++] = nums[index_negative];
            }
        }

        return ans;
    }
}

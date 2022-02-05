import java.util.Arrays;

//Problem Statement: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerthanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        smallerNumbersThanCurrent(arr);
    }
    static void smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    count++;
                    res[i] = count;
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}


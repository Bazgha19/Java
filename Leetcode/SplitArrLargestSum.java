//Problem Statement: https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int p = 1; //number of sub-arrays

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    sum = nums[i];
                    p++;
                } else {
                    sum = sum + nums[i];
                }
            }
            if (p > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}

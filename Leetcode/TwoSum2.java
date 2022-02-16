//Problem Statement: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;
        while (start <= end) {
            sum = numbers[start] + numbers[end];
            if (target < sum) {
                end--;
            } else if (target > sum) {
                start++;
            } else {
                res[0] = start+1;
                res[1] = end+1;
                return res;
            }
        }
        return res;
    }
}

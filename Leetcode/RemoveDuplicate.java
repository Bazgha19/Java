//Problem Statement: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (ans == 0 || n > nums[ans - 1])
                nums[ans++] = n;
        }
        return ans;
    }
}

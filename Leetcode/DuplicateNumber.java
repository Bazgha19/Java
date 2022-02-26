//Problem Statement: https://leetcode.com/problems/find-the-duplicate-number
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,4};
        Arrays.sort(arr);
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            ans = Math.abs(nums[i]);
            ans--;
            if(nums[ans] < 0) {
                return  Math.abs(nums[i]);
            } else {
                nums[ans] = -nums[ans];
            }

        }
        return -1;
    }

}



//Wrong in some cases
//Arrays.sort(nums);
//        int[] res = nums;
//
//        int start = 0;
//        int end = res.length;
//
//        while( start <= end){
//        int mid = start + (end-start)/2;
//
//        if (res[mid] == res[mid+1]){
//        return res[mid];
//        } else if ( res[mid] > res[mid+1]){
//        start++;
//        } else{
//        end--
//        }
//
//        }
//        return -1;
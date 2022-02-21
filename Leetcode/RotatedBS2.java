public class RotatedBS2 {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,4,3,2,4,3};
        int target = 4;
        System.out.println(search(nums,target));
    }

    static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }

}


import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        shuffle(arr, n);
    }
    static void shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for (int i = 0; i < n; i++) {
            res[2*i] = nums[i];
            res[2*i+1] = nums[i+n];
        }
        System.out.println(Arrays.toString(res));
    }
}

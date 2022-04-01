import java.util.Arrays;

//Problem Statement: https://leetcode.com/problems/decode-xored-array/
public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(arr, first)));
    }
    static int[] decode(int[] encoded, int first) {
        int ans[] = new int[encoded.length+1];
        ans[0] = first;
        for(int i =0; i<ans.length-1; i++){
            ans[i+1] = ans[i]^encoded[i];
        }
        return ans;
    }
}

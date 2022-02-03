//Problem Statement: https://leetcode.com/problems/concatenation-of-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrConcatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,5};
        int [] ans = new int[2*arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = (ans[i+arr.length] = arr[i]);
        }
        System.out.println(Arrays.toString(ans));




//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println("Enter length of array: ");
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr.add(in.nextInt());
//        }
//        System.out.println(arr);
//
//        for(int j = 0; j<n; j++){
//            arr.add(arr.get(j));
//        }
//        System.out.println(arr);

    }
}

//Problem Statement: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.*;
public class KidCandies {
    public static void main(String[] args) {
        int n = 3;
        int[] cand = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(cand, n));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i],max);
        }
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i]+extraCandies >= max);
        }
        return res;
    }
}

//    static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
//        int[] res = new int[candies.length];
//        int max = candies[0];
//        boolean[] ans =new boolean[candies.length];
//        for (int i = 0; i < candies.length; i++) {
//            res[i] = candies[i] + extraCandies;
//            if (candies[i] > max) {
//                max = candies[i];
//            }
//            for (int j = 0; j<candies.length; j++){
//                if (res[i]>=max){
//                    ans[j] = true;
//                }
//                else {
//                    ans[j] = false;
//                }
//            }
//
//        }
//        return ans;
//    }
//}


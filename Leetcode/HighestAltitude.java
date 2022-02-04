//Problem Statement: https://leetcode.com/problems/find-the-highest-altitude/

import java.util.Arrays;
public class HighestAltitude {
    public static void main(String[] args){
        int[] arr = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0] = 0;
        int max = res[0];
        for(int i = 1; i<res.length; i++){
            res[i] = res[i-1]+gain[i-1];
        }
        for(int j = 0; j<res.length; j++){
            if (res[j]>max){
                max = res[j];
            }
        }
        return max;
    }
}

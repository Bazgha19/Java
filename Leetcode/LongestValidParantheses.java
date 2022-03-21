//Problem Statement: https://leetcode.com/problems/longest-valid-parentheses/
public class LongestValidParantheses {
    public static void main(String[] args) {
       String s = "(()";
        System.out.println(longestValidParentheses(s));
    }
    static int longestValidParentheses(String s) {
        int[] arr = new int[s.length()];
        int result = 0;
        int leftCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            } else if (leftCount > 0){
                arr[i] = arr[i - 1] + 2;
                arr[i] += (i - arr[i]) >= 0 ? arr[i - arr[i]] : 0;
                result = Math.max(result, arr[i]);
                leftCount--;
            }
        }
        return result;
    }
}

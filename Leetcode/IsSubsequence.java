//Problem Statement: https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t) {
        int ans = 0;
        for(int i = 0; i < t.length() && ans < s.length(); i++) {
            if(t.charAt(i) == s.charAt(ans)) {
                ans++;
            }
        }
        return ans == s.length();
    }
}

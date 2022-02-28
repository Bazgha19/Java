//Problem Statement: https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 153;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        long ans = 0;
        while (x!=0){
            int r = x%10;
            ans = (ans*10)+r;
            x = x/10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;

        return (int)ans;
    }
}

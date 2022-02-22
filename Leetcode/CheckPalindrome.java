public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int x) {
        int original = x;
        int ans = 0;
        while(x>0){
            int r = x%10;
            ans = (ans*10)+r;
            x = x/10;
        }

        if (ans == original){
            return true;
        }
        return false;

    }
}

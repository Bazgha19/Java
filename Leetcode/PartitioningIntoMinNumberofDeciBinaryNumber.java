//Problem Statement: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
public class PartitioningIntoMinNumberofDeciBinaryNumber {
    public static void main(String[] args) {
        String number = "32";
        System.out.println(minPartitions(number));
    }
    static int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); ++i)
            ans = Math.max(ans, n.charAt(i) - '0');
        return ans;
    }

}

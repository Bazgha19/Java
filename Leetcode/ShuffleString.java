//Problem Statement: https://leetcode.com/problems/shuffle-string/
public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};
        System.out.println(restoreString(str, indices));
    }
    static String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    }
}

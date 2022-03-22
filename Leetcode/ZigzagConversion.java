//Problem Statement: https://leetcode.com/problems/zigzag-conversion/
public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int row = 3;
        System.out.println(convert(s, row));
    }
    static String convert(String s, int numRows) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        StringBuffer[] res = new StringBuffer[numRows];
        for (int i = 0; i < res.length; i++) res[i] = new StringBuffer();

        int i = 0;
        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) // vertically down
                res[j].append(ch[i++]);
            for (int j = numRows-2; j >= 1 && i < len; j--) // obliquely up
                res[j].append(ch[i++]);
        }
        for (int j = 1; j < res.length; j++)
            res[0].append(res[j]);
        return res[0].toString();
    }

}

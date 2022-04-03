//Problem Statement: https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

import java.util.ArrayList;
import java.util.List;

public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
        String[] arr = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(arr));
    }
    static int numberOfBeams(String[] bank) {
        List<Integer> res =new ArrayList<>();
        for (int j = 0; j < bank.length; j++) {
            String s = bank[j];
            int count = 0;
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char ch = charArray[i];
                if (ch == '1') {
                    count++;
                }
            }
            if (count > 0) {
                res.add(count);
            }
        }
        int ans=0;
        for(int i=0;i<res.size()-1;i++){
            int temp=res.get(i)*res.get(i+1);
            ans+=temp;
        }
        return ans;
    }
}

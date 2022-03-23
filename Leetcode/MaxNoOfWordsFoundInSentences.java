//Problem Statement: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
public class MaxNoOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] s = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
    static int mostWordsFound(String[] sentences) {
        int res=0;
        for(int i=0; i<sentences.length; i++) {
            res = Math.max(res,(sentences[i].split(" ")).length);
        }
        return res;
    }
}

public class GuessNo {
    public static void main(String[] args) {
        int n = 10;
        int p = 5;
        System.out.println(guessNumber(n, p));
    }
    static int guessNumber(int n, int pick) {
        for(int i = 1; i<=n; i++){
            int start = i;
            int end = n;
            while (start<=end){
                int mid = start + (end-start)/2;
                if (pick<mid){
                    end = mid-1;
                } else if(pick>mid){
                    start = mid+1;
                }
                else {
                    return pick;
                }
            }
        }
        return -1;
    }
}


//Leetcode solution
//    public int guessNumber(int n) {
//        int i = 1, j = n;
//        while(i < j) {
//            int mid = i + (j - i) / 2;
//            if(guess(mid) == 0) {
//                return mid;
//            } else if(guess(mid) == 1) {
//                i = mid + 1;
//            } else {
//                j = mid;
//            }
//        }
//        return i;
//    }
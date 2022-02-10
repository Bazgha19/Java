public class SquareRoot {
    public static void main(String[] args) {
        int number = 8;
        System.out.println(sqrt(number));
    }
    static int sqrt(int number){
        if(number==0){
            return 0;
        }
        int start = 1;
        int end = number;
        while (start<end){
            int mid = start+(end-start)/2;
            if(mid<=number/mid && (mid+1)>number/(mid+1)){
                return mid;
            } else if(mid>number/mid){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}

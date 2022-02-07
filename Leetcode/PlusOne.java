import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        plusOne(arr);

    }
    static void plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]< 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
            }
            else{
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        System.out.println(Arrays.toString(res));
    }
}



//Not working for 9, 99,999
//        int n = 0;
//        int[] res = new int[digits.length];
//        for (int i = 0; i < digits.length; ++i) {
//            n = (n*10)+digits[i];
//        }
//        n = n+1;
//        String number = String.valueOf(n);
//        for (int i = 0; i < digits.length; i++) {
//            res[i] = Integer.parseInt(Character.toString(number.charAt(i)));
//        }
//        System.out.println(Arrays.toString(res));
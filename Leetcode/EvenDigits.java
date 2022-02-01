//Problem Statement: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {34,4560,9993,13};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (checkEven(num)) {
                count++;
            }
        }
        return count;
    }

    //Check if the total no. of digit is even or not
    static boolean checkEven(int num){
        int checkEven = digit(num);
        return (checkEven%2 == 0);
    }

    //count number of digits in a number
    static int digit(int num){
        if (num<0){
            num = num*(-1);
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

//    //Also we can convert int to string and check the length so we don't need any digit function to check the digit length
//    static boolean checkEven(int num){
//        String val = String.valueOf(num);
//        return (val.length() % 2) == 0;
//    }
}

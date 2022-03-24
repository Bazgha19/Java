//Problem Statement: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(numberOfSteps(num));
    }
    static int numberOfSteps(int num) {
        if(num == 0) {
            return 0;
        } else if(num % 2 == 0) {
            return (numberOfSteps(num/2) + 1);
        } else if(num % 2 == 1) {
            return (numberOfSteps(num-1) + 1);
        }
        return 0;
    }
}

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = in.nextLong();
        long sum = 0;
        while (n>0){
            long r = n %10;
            sum = sum+r;
            n = n/10;
        }
        System.out.println("Sum of all numbers: "+sum);
    }
}

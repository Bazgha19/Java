import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        palindrome(n);
    }

    static void palindrome(int number) {
        int original = number;
        int result = 0;
        while (number>0){
            int r = number%10;
            result = (result*10)+r;
            number = number/10;
        }
        if (original == result){
            System.out.println(original+" is a palindrome");
        }
        else{
            System.out.println(original+" is not a palindrome");
        }
    }
}

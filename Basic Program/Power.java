import java.util.Scanner;

public class Power{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        System.out.print("Enter exponent: ");
        int n = in.nextInt();
        double p = Math.pow(a,n);
        System.out.println(p);
    }
}

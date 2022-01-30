import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        py(a,b,c);
    }
    static void py(int a, int b, int c){
        int lhs = (a*a)+(b*b);
        int rhs = (c*c);
        if (lhs == rhs){
            System.out.println(a+", "+b+", "+c+" are pythagorean triplet");
        }
        else{
            System.out.println(a+", "+b+", "+c+" are not pythagorean triplet");
        }
    }
}

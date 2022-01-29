import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int temp;
        System.out.print("Enter the value of a: ");
        int a = in.nextInt();
        System.out.print("Enter the value of b: ");
        int b = in.nextInt();
        System.out.println("Before Swapping: ");
        System.out.println("a = "+a+", b = "+b);
        swap(a,b);

    }

    static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("a = "+a+", b = "+b);
    }
}

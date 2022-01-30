import java.util.Scanner;

public class SumofNaturalNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        sum(n);
    }

    static void sum(int number){
        int sum = 0;
        for (int i = 0; i <=number ; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of "+number+" natural numbers = "+sum);

    }
}



import java.util.Scanner;

public class subProdcutAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 1;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            p = p * r;
            s = s + r;
            n = n / 10;
        }
        int result = p - s;
        System.out.println(result);
    }
}

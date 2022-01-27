import java.util.Scanner;

public class Occur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number = in.nextInt();
        int count = 0;
        while(n>0){
            int r = n%10;
            if (r==number){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int store = 0;
        while (n>0){
            int r = n%10;
            store = (store*10)+r;
            n = n/10;
        }
        System.out.println(store);
    }
}

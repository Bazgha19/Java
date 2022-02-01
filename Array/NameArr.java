//Take an array of names as input from the user and print them on the screen.
import java.util.Scanner;

public class NameArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = in.next();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+" ");
        }
    }

}

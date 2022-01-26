import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Welcome "+ name + ", to this programming world!");
    }
}

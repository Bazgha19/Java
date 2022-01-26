import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int number = s.nextInt();
            if (number%2==0){
                System.out.println(number + " is even number");
            }
            else {
                System.out.println(number + " is odd number");
            }
        }
    }
}

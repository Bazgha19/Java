import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float simple_interest = (p*r*t);
        System.out.println("Simple Interest = "+ simple_interest);
    }
}

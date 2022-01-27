import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long rupees = input.nextLong();
        double usd = rupees * 0.013;
        System.out.println(rupees+ " rupees is equal to  "+usd+" USD");
    }

}





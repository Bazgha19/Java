import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        if (a>b){
            System.out.println(a + " is largest.");
        } else if(a<b){
            System.out.println(b + " is Largest.");
        }
        else {
            System.out.println(a + " and "+ b + " are equal");
        }
    }
}

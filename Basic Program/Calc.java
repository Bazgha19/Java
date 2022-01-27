import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.print("Enter Operator: ");
        String operator = input.next();
        float result;
        if (operator.equals("+")){
            result = a+b;
            System.out.println("Sum is " + result);
        } else if (operator.equals("-")){
            result = a-b;
            System.out.println("Difference is " + result);
        } else if (operator.equals("*")){
            result = a*b;
            System.out.println("Product is " + result);
        } else if (operator.equals("/")){
            result = a/b;
            System.out.println("Division is " + result);
        }
        else {
            System.out.println("Invalid operator!");
        }
    }
}

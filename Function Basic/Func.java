import java.util.Scanner;

public class Func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String message = in.nextLine();
        System.out.println(Greet2(message));
    }
    static String Greet2(String name){
        String msg = "Welcome "+ name + "!";
        return msg;
    }

    static String Greet(){
        String message = "Hello, how are you?";
        return message;
    }
    static void Add(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum is "+sum);
    }
}

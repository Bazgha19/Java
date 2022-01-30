import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println(VoteAge(age));
    }

    static String VoteAge(int age){
        if (age>=18){
            return "Congratulations, you are eligible for voting!";
        }
        return "Sorry, you are too small for voting!";
    }

}

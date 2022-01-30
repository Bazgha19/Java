import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int number = in.nextInt();
        grade(number);
    }
    static void grade(int number){
        if (91<=number & number<=100) {
            System.out.println("Grade: AA");
        } else if (81<=number & number<=90){
            System.out.println("Grade: AB");
        } else if (71<=number & number<=80){
            System.out.println("Grade: BB");
        } else if (61<=number & number<=70){
            System.out.println("Grade: BC");
        } else if (51<=number & number<=60){
            System.out.println("Grade: CD");
        } else if (41<=number & number<=50){
            System.out.println("Grade: DD");
        }
        else{
            System.out.println("Grade: Fail");
        }
    }
}

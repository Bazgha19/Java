import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//        System.out.println(isArmstrong(n));

        //Print all three digit armstrong number
        System.out.println("Armstrong Numbers");
        for (int i = 100; i <1000 ; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int number = n;
        int arm = 0;
        while (n>0){
            int r = 0;
            r = n%10;
            arm = arm + (r*r*r);
            n = n/10;
        }
        return arm == number;
    }
}

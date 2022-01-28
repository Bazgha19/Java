import java.util.Scanner;

public class EvenDayOFAug {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i<=31; i++){
            if (i%2==0){
                count++;
            }
        }
        System.out.print("Total even days of august: "+count);
    }
}

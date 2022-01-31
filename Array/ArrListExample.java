import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(23);
//        list.add(37);
//        list.add(50);
//        list.add(63);
//        System.out.println(list);
//        list.set(2,100);
//        System.out.println(list); //Print updated list
//        System.out.println(list.contains(100)); //If list contains the value then it return true
//        System.out.println(list.remove(1)); //remove element from the given index
//        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list); // to print the list

        //Another method to print the list or element of the list
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(i)+" "); //list[index] syntax will not work here so we use get() to print the list
        }
    }
}

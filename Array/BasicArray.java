import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 7;
        System.out.println("First Array");
        for (int i = 0; i <3 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Second Array");
        int[] arr2 = {1,2,3,4};
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
        //Take input of array length
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] arr3 = new int[size];
        for (int i=0; i<size; i++){
            System.out.println(arr3[i]+" "); //prints null values
        }
        System.out.println("");

        System.out.print("Enter size of second array: ");
        int size2 = in.nextInt();
        int[] arr4 = new int[size2];
        //loop for taking input of array
        for (int i = 0; i <size2 ; i++) {
            arr4[i] = in.nextInt();
        }
        //print output array list
        System.out.println("arr4:-");
        for (int i = 0; i <size2 ; i++) {
            System.out.print(arr4[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter size of string array:");
        int size3 = in.nextInt();
        String[] arr5 = new String[size3];
        //loop for taking input of array
        for (int i = 0; i <size3; i++) {
            arr5[i] = in.next();
        }
        //print output array list
        System.out.println("arr5:-");
        for (int i = 0; i <size3; i++) {
            System.out.print(arr5[i]+" ");
        }
    }
}

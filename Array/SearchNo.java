import java.util.Scanner;

public class SearchNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter an element to search in the array:");
        int n = in.nextInt(); //search this number
        for (int i = 0; i <size; i++) {
            if (n == arr[i]){
                System.out.println("Element "+n+" present at index :"+i);
            }
        }

    }
}

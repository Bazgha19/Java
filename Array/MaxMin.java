import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        System.out.println("Enter element of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Max(arr);
        Min(arr);
    }

    static void Max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>max){
               max = arr[i];
           }
        }
        System.out.println(max);
    }

    static void Min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

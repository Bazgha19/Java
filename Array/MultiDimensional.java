import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c <arr[r].length; c++) {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println("");
        }

//        int[][] arr = new int[3][2];
//        //input of multidimensional array
//        for (int r = 0; r < arr.length; r++) {
//            for (int c = 0; c<arr[r].length; c++){
//                arr[r][c] = in.nextInt();
//            }
//        }

        //output of the array

//        for (int r = 0; r<arr.length; r++){
//            for (int c = 0; c<arr[r].length; c++){
//                System.out.print(arr[r][c]+" ");
//            }
//            System.out.println("");
//        }

//        //Another way to print 2d array
//        for (int r = 0; r < arr.length; r++) {
//            System.out.println(Arrays.toString(arr[r]));
//        }






//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println((arr[2][2]));
    }
}


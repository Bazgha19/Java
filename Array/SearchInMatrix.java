import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int row = in.nextInt();
        System.out.print("Enter the value of column: ");
        int column = in.nextInt();
        int[][] arr = new int[row][column];


        //Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //Output
        System.out.print("Enter a number to search: ");
        int n = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == n){
                    System.out.println("Found at row "+i+" and column "+j);
                }
            }
        }

    }
}

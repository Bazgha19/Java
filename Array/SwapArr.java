import java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = {1,2,3,4};
        swap(list, 1, 3);
    }

    private static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
        System.out.println(Arrays.toString(list));
    }
}

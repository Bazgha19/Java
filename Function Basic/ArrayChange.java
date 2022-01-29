import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] array) {
        array[0] = 100; //if you make change to the object via this reference variable, same object will be changed.
    }
}

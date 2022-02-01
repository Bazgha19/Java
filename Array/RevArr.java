import java.util.Arrays;

public class RevArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
    }

    static void rev(int[] list){
        int start  = 0;
        int end = list.length-1;
        while (start<end){
            int temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(list));
    }
}

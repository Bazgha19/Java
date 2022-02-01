public class Max {
    public static void main(String[] args) {
        int[] arr = {2,300,4,56,433,673};
        max(arr);
        maxRange(arr, 1,4);
    }
    
    static void max(int[] list){
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max){
                max = list[i];
        }
        }
        System.out.println("Maximum value from the list = "+max);
    }

    //Maximum number in the given range
    static void maxRange(int[] list, int index1, int index2){
        int max2 = list[index1];
        for (int i = index1; i <index2; i++) {
            if (list[i]>max2){
                max2 = list[i];
            }
        }
        System.out.println("Maximum value from the list in the given range = "+max2);
    }
}

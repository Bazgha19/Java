public class Floor {
    public static void main(String[] args) {
        int[] arr = {4,6,8,9,28,34,54,66,70};
        int target = 33;
        System.out.println(floor(arr, target));
    }
    //Floor value: Less than or equal to target element.
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end = end-1;
            } else if(target>arr[mid]){
                start = start+1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}

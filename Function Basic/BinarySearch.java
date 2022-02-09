public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,1,2,3,4,5};
        int target = 5;
        System.out.println(binSearch(arr, target));
    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
//        System.out.println(end);
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }
}

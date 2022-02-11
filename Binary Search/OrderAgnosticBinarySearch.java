public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,4,5,47,59,60};
        int[] arr = {99,78,43,30,29,10,1,0};
        int target =  29;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
         boolean isAscending = arr[start]< arr[end];
         while (start<=end){
             int mid = start + (end-start)/2;
             if (target==arr[mid]){
                 return mid;
             }
             if(isAscending){
                 if (target<arr[mid]){
                     end = mid-1;
                 } else {
                     start = mid+1;
                 }
             }
             else {
                 if (target>arr[mid]){
                     end = mid-1;
                 }
                 else{
                     start = mid+1;
                 }
             }
         }
         return -1;
    }
}

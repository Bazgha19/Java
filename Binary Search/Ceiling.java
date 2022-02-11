public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,1,2,3,4,5,7,8,9,10};
        int target =6;
        System.out.println(ceil(arr,target));
    }

    //Ceil Value: Greater than or equal to target element
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if (target>arr[arr.length-1]){
            return -1;
        }

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]) {
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}

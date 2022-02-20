//Problem Statement: https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotDuplicate(nums);

        // if pivot is not found
        if (pivot == -1){
            return binarySearch(nums,target,0, nums.length-1);
        }

        // if pivot element is found
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }


    //This will not work with duplicate elements present in the array
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }


    // For duplicate elements present in the array
    static int findPivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if (arr[start] == arr[mid] && arr[end] == arr[mid]){

                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                if (arr[end-1] > arr[end]){
                    return end;
                }
                end--;

            }

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            } else {
                end = mid-1;
            }

        }
        return -1;
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}

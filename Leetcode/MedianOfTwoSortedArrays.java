//Problem Statement: https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] n1 = {1,3};
        int[] n2 = {2,4};
        System.out.println(findMedianSortedArrays(n1, n2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median =0.0;
        int total = nums1.length + nums2.length;
        int mid = total/2 + 1;
        int i = 0, j=0;
        int a = 0, b=0;
        while(a<mid && b<mid){
            if(i<nums1.length && (j >= nums2.length || nums1[i] <= nums2[j])) {
                i++;
                a = i + j;
            }else{
                j++;
                b = i+j;
            }
            if(total%2==0){
                if(a==mid-1)
                    median = nums1[i-1];
                else if(b==mid-1)
                    median = nums2[j-1];
            }
            if(a==mid){
                median += nums1[i-1];
            }else if(b==mid){
                median += nums2[j-1];
            }
        }
        median = (total%2!=0)?median:median/2.0;
        return median;
    }
}

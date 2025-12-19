class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged=new int[nums1.length+nums2.length];
        int k=0;
        // k le index hercha;

        for(int i=0;i<=nums1.length-1;i++){
            merged[k++]=nums1[i];
        }
        for(int i=0;i<=nums2.length-1;i++){
            merged[k++]=nums2[i];

        }
        Arrays.sort(merged);
        int n=merged.length;
        //the array can be odd or even so case;
        if (n % 2 != 0) {
            return merged[n / 2];
        }

        else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }

        
    }
}
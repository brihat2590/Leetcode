class Solution {
    public int findMin(int[] nums) {

        int left=0;
        int right=nums.length-1;

        //if array sorted condition ma

        if(nums[left]<=nums[right]){
            return nums[left];
        }

        //binary search kai concept

        while(left<right){
            //very large nu cha bhane overflow 
            //if simple right-left by 2 garyo vane
            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right]){
                //yei bich ma xa
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return nums[left];
        
    }
}
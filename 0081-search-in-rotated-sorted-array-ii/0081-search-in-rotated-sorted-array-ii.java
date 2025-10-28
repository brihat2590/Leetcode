class Solution {
    public boolean search(int[] nums, int target) {

        //duplicate cha so shrink gardine otherwise similar 

        if(nums.length==0) return false;

        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }

            if(nums[left]==nums[mid]&& nums[mid]==nums[right]){
                left++;
                right--;
            }
            //check if left side is sorted paila
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    //leave the left right half
                    left=mid+1;
                }
            }
            else{
                if(nums[right]>=target && target>nums[mid]){
                    left=mid+1;

                }
                else{
                    right=mid-1;
                }
            }
            
        }
        return false;
        
    }
}
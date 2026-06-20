class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        
    //best approach to find the inflection point

    int left=0;
    int ans=Integer.MAX_VALUE;
    int right=nums.length-1;
    while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]==nums[left] && nums[mid]==nums[right]){
            ans=Math.min(ans,nums[left]);
            left++;
            right--;
            continue;
        }
        if(nums[left]<=nums[mid]){
            ans=Math.min(ans,nums[left]);
            left=mid+1;
        }
        else{
            ans=Math.min(ans,nums[mid]);
            right=mid-1;
            
        }

        
    }
    return ans;
}}
class Solution {
    public int findMin(int[] nums) {
    
    //best approach to find the inflection point

    for(int i=1;i<nums.length;i++){
        if(nums[i]<nums[i-1]){
            return nums[i];
        }
    }
    //base 
    return nums[0];
        
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int currMax=0;
        int maxSum=nums[0];
        int minSum=nums[0];
        int currMin=0;
        int totalSum=0;
        for(int num:nums){
            currMax=Math.max(num,currMax+num);
            currMin=Math.min(num,currMin+num);
            maxSum=Math.max(maxSum,currMax);
            minSum=Math.min(minSum,currMin);
            totalSum+=num;

        }
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
        
    }
}
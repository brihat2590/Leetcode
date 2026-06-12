class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            //pre seed the window to 4 places

            sum=sum+nums[i];
        }
        int maxSum=sum;
        for(int i=k;i<nums.length;i++){
            //add the new sum
            sum+=nums[i];
            //remmove the old one ek pachadi;
            sum-=nums[i-k];
            maxSum=Math.max(maxSum,sum);
        }

        return (double) maxSum/k;
        
        
    }
}
class Solution {
    public int rob(int[] nums) {

        int index=nums.length;
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);

        
        return recur(index,nums,dp);
        
    }
    public int recur(int index,int[] nums,int[] dp){
        if(index==1){
            dp[index]=nums[0];
            return nums[0];
        }
        if(index==0){
            dp[index]=0;
            return 0;


        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int pick=nums[index-1]+recur(index-2,nums,dp);
        int dontPick=0+recur(index-1,nums,dp);

        dp[index]=Math.max(pick,dontPick);
        return dp[index];
    }
}
class Solution {
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int money1=rob(0,nums.length-2,nums);
        int money2=rob(1,nums.length-1,nums);

        return Math.max(money1,money2);


        
    }
    public int rob(int start,int end,int[] nums){

        int prev1=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int pick=prev2+nums[i];
            int skip=prev1;
            int curr=Math.max(pick,skip);
            prev2=prev1;
            prev1=curr;
            
        }
        return prev1;

    }
}
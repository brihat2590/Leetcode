class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        Reverse(0,n-1,nums);
        Reverse(0,k-1,nums);
        Reverse(k,n-1,nums);
        
    }

    public void Reverse(int start,int end,int[] nums){
        int temp=0;
        while(start<end){
             temp=nums[start];
             nums[start]=nums[end];
             nums[end]=temp;
            start++;
            end--;
            
        }
    }
}
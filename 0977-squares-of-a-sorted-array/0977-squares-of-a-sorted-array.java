class Solution {
    public int[] sortedSquares(int[] nums) {
        //two pointer approach ni cha
        //higher value either left or right mai ho 
        int n=nums.length-1;
        int[] arr=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int idx=nums.length-1;

        while(left<=right){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];

            if(leftSq>rightSq){
                arr[idx--]=leftSq;
                left++;

            }
            else{
                arr[idx--]=rightSq;
                right--;
            }
        }
        return arr;


        
    }
}
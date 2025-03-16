class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){

            //equal vaena pointer badhayo pointer ko val i sange equal
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                
            }
        }
        return k;
        
    }
}
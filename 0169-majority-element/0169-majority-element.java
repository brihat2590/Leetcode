class Solution {
    public int majorityElement(int[] nums) {
        int counter=0;
        int majorityElement=-1;
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                majorityElement=nums[i];
            }

            if(nums[i]==majorityElement){
                counter++;

            }
            else{
                counter--;
            }
        }
        return majorityElement;
        
    }
}
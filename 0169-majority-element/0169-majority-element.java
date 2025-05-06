class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int maxFreq=-1;
        // int maxNumber=0;

        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        //     if(map.get(num)>maxFreq){
        //         maxFreq=map.get(num);
        //         maxNumber=num;
        //     }
        // }
        // return maxNumber;



        //simple method
        Arrays.sort(nums);
        //sort vayo increasing order ma
        int n=nums.length;
        return nums[n/2];

    }
}
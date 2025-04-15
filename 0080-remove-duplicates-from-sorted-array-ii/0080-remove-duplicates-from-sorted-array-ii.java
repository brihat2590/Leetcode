class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)<=2){
                nums[k]=num;
                k++;
            }


        }
        return k;
        
        
        
    }
}
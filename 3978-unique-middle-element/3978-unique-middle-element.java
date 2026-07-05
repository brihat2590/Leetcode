class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int middleIndex=nums.length/2;

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=nums[middleIndex];
            if(map.get(value)==1){
                return true;
            }
        }
        return false;
        
    }
}
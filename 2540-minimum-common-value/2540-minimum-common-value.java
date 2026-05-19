class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
        
        
        
    }
}
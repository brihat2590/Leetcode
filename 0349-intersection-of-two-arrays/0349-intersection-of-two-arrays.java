class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash=new HashSet<>();
        HashSet<Integer> inter=new HashSet<>();
        for(int i:nums1){
            hash.add(i);
            
        }
        for(int i:nums2){
            if(hash.contains(i)){
                inter.add(i);

            }
        }
        int[] result=new int[inter.size()];
        int index=0;
        for(int i:inter){
            result[index++]=i;
            
        }
        return result;
    }
}
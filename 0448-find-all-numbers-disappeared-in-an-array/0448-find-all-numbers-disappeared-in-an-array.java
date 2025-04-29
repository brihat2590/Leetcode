class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            map.add(num);
        }
        
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!map.contains(i)){
                list.add(i);
                
            }


        }
        return list;
        
    }
}
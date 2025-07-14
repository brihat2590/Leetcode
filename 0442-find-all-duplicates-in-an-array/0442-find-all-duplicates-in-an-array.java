class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashSet<Integer> seen=new HashSet<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int num:nums){
            if(!seen.contains(num)){
                seen.add(num);
            }
            else{
                duplicates.add(num);

            }
        }
        return duplicates;
        
    }
}
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicated=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                duplicated.add(nums[i]);
            }
        }
        return duplicated;

    
        
    }
}
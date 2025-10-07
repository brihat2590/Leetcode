class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res=new HashSet<>();

        int n=nums.length;

        for(int i=0;i<n;i++){
            int target=-nums[i];
            Set<Integer> seen=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int comp=target-nums[j];
                if(seen.contains(comp)){
                    List<Integer> triplet=Arrays.asList(nums[i],nums[j],comp);
                    Collections.sort(triplet);
                    res.add(triplet);
                }
                 seen.add(nums[j]);
            }
           
        }
        return new ArrayList<>(res);
        
    }
}
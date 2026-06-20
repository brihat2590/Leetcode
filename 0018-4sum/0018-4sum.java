class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

       
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hash=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fourth=(long)target-(sum);

                    if(hash.contains(fourth)){
                        List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],(int)fourth));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hash.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
        
        
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);

        }

        ArrayList<Integer> List=new ArrayList<>(set);

        Collections.sort(List,Collections.reverseOrder());

        if(List.size()>=3){
            return List.get(2);
        }

        return List.get(0);
        
        
    }
}
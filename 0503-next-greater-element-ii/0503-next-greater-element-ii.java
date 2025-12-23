class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        int n=nums.length;

        for(int i=0;i<n;i++){
            result[i]=-1;

            for (int k = 1; k < n; k++) {
                int j = (i + k) % n;
                if (nums[j] > nums[i]) {
                    result[i] = nums[j];
                    break;
                   }   }
        }
        return result;
        
    }
}
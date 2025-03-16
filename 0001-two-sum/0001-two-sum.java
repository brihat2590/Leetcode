class Solution {
    public int[] twoSum(int[] nums, int target) {

        //hasmap chito fetch
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result=new int[2];


        for(int i=0; i<nums.length; i++) {
            //check garyo
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;

            }
            map.put(nums[i],i);
            
        }
        return result;
        
    }}
    //brute force approach
//     public int[] twoSum1(int[] nums,int target){
//         int[] ans=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     break;
//                 }

//             }
//         }
//         return ans;

//     }
//     public int twosum2(int []nums,int target){
//         int[] ans=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }
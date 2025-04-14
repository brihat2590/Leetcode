class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int arr[]=new int[2];
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if (numbers[i] + numbers[j] == target) {
        //             arr[0] = i+1;
        //             arr[1] = j+1;
        //             return arr; // return immediately when found
        //         }

        //     }

        // }
        // return arr;

        //more optimized code two pointer approach
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[] {left+1,right+1};
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {};

        
    }
}
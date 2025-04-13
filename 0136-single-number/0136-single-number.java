class Solution {
    public int singleNumber(int[] nums) {
        // int result=0;
        // for(int num:nums){
        //     result^=num; //xor operation
        // }
        // return result;


        //hashmap wala method

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:map.keySet()){
            if(map.get(num)==1) return num;
        }
        return -1;

    
        
    }
}
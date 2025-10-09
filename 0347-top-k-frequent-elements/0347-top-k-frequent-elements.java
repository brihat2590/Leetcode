class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(k==nums.length){
            return nums;
        }
        HashMap<Integer,Integer> map=new HashMap<>();

       

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        };
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b) 
        );

        for(int n:map.keySet()){
            minHeap.add(n);
            if(minHeap.size()>k){
                minHeap.poll();
            }

        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=minHeap.poll();
        }
        return ans;
         




    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int num:nums){
            minHeap.offer(num);
            //add elements to the heap
        
        //allow only k number of elements in the heap
        if(minHeap.size()>k){
            minHeap.poll();
            //when size exceeds k remove the smallest element which is not the kth largest
        }}
        //asc order ma hunxa so the first el nai kth largest ho

        return minHeap.peek();
        

    
    }
}
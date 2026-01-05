class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int[] flatarray=Arrays.stream(matrix)
        .flatMapToInt(Arrays::stream).toArray();

        //the arrays should be already sorted;

        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());

        for(int num:flatarray){
            queue.offer(num);

            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();

        
        
    }
}
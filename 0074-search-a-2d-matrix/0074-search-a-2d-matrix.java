class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row=matrix.length;
        int cols=matrix[0].length;

        int left=0;
        int right=row*cols-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            //yo chai values herna paryo mid index;

            int value=matrix[mid/cols][mid%cols];

            if(value==target){
                return true;
            }
            else if(value<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
        
    }
}
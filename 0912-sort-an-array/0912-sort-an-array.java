class Solution {
    public int[] sortArray(int[] nums) {

        if (nums.length==0) return nums;
        divide(nums,0,nums.length-1 );


        return nums;



        
    }
    public void divide(int[] nums,int start,int end){
        if(start>=end) return;

        int mid=start+(end-start)/2;

        divide(nums,start,mid);
        divide(nums,mid+1,end);
        conquer(nums,start,end,mid);
    }
    public void conquer(int[] nums,int start,int end,int mid){
        int[] merged=new int[end-start+1];

        int indx1=start;
        int indx2=mid+1;
        int x=0; //pointer for the merged array;
        while(indx1<=mid && indx2<=end){
            if(nums[indx1]<=nums[indx2]){
                merged[x++]=nums[indx1++];
            }
            else{
                merged[x++]=nums[indx2++];
            }
        }
        
        while(indx1<=mid){
            merged[x++]=nums[indx1++];
        }
        while(indx2<=end){
            merged[x++]=nums[indx2++];
        }

        //now merged arrays like nums banaune;

        for(int i=0;i<merged.length;i++){
           nums[start+i]=merged[i];
        }
          
    }
}
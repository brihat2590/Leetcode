class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int i=0;
        int element=1;
        while(i+1<n){
            arr[i]=element;
            arr[i+1]=-element;
            element++;
            i=i+2;

        }
        return arr;
        
    }
}
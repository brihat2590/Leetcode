class Solution {
    public String reverseStr(String s, int k) {
       
       
        char[] b=s.toCharArray();
        char temp;
        int n=b.length;
        for (int i=0;i<n;i+=2*k){
            int left=i;
            int right=Math.min(i + k - 1, n - 1);
            while(left<right){
            temp=b[left];
            b[left]=b[right];
            b[right]=temp;
            left=left+1;
            
            right--;

        }
        
        
        }
        String sr=new String(b);
        return sr;
       
        
        
    }
}
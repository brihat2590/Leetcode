class Solution {
    public int countGoodSubstrings(String s) {

        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            if(right-left+1==3){
                //3 ta val huna paryo right 2 index ma pugesi
                //hunxa i,i+1,i+2
                 
                 //left aghi badhaune
                char a=s.charAt(left),b=s.charAt(left+1),c=s.charAt(left+2);

                if(a!=b && b!=c && c!=a){
                    count++;

                }
                left++;
            }
            
        }
        return count;
        
        
    }
}
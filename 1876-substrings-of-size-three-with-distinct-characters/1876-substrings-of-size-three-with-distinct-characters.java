class Solution {
    public int countGoodSubstrings(String s) {

        //contiguos vaneko xa so direct loop
        int count=0;
        for(int i=0;i+2<s.length();i++){
            char a=s.charAt(i),b=s.charAt(i+1),c=s.charAt(i+2);
            //contiguos xan sab
            if(a!=b && b!=c &&c!=a){
                count++;
                //direct vetiyo count
            }
        }
        return count;
        
    }
}
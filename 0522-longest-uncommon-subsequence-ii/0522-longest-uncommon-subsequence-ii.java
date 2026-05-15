class Solution {
    public int findLUSlength(String[] strs) {

    if(strs.length==0){
        return -1;
    }
    int ans=-1;
    for(int i=0;i<strs.length;i++){
        boolean valid=true;

        for(int j=0;j<strs.length;j++){
            if (i != j && isSubSequence(strs[i], strs[j])) {
                    valid = false;
                    break;
                }


        }
        if (valid) {
                ans = Math.max(ans, strs[i].length());
    }
        

      
    }
    

    return ans;

        
    }

    public boolean isSubSequence(String a, String b){
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;



        }
        if(i==a.length()) return true;

        return false;
    }
}
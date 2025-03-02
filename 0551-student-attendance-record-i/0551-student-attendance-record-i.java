class Solution {
    public boolean checkRecord(String s) {
        int lateC=0;
        int absentC=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='A'){
                absentC++;
                if(absentC>=2) return false;
            }
            if(c=='L'){
                lateC++;
                if(lateC==3) return false;
            }
            else{
                lateC=0;
            }
        }
        return absentC<2 && lateC<3;
        
        
        
    }
}
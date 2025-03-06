class Solution {
    public boolean detectCapitalUse(String word) {

        int n=word.length();
        //length 1 ko sab valid
        if(n<2) return true;
        boolean firstUpper=Character.isUpperCase(word.charAt(0));
        boolean secondUpper=Character.isUpperCase(word.charAt(1));

        //first ra 2nd letter paxi sab upper
        if(firstUpper && secondUpper){
            for(int i=2;i<n;i++){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }

        }
        //sab lowercase first ra 2nd paxi
        else{
            for(int i=1;i<n;i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            
        }
        return true;

         

        
    }
}
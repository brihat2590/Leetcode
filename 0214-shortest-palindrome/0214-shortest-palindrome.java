class Solution {
    public String shortestPalindrome(String s) {

        int i=0;
        int n=s.length();

        for(int j=n-1;j>=0;j--){
            if(s.charAt(i)==s.charAt(j)){
                i++;
            }

        }
        if(i==n){
            //pailai palidrome if both char from s to e are corret i 
            //will be equal to n
            return s;
        }
        String suffix=s.substring(i);
        //i samma milne cha yeta bata so aba namilne agadi add gardine;

        String reversed=new StringBuilder(suffix).reverse().toString();

        return reversed+ shortestPalindrome(s.substring(0, i))+suffix;
        
    }
}
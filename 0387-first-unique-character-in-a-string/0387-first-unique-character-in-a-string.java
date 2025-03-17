class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character,Integer> hash=new HashMap<>();

        // for(char ch:s.toCharArray()){
        //     hash.put(ch,hash.getOrDefault(ch,0)+1);
        //     //if ch pailai present we get the count and increment it
        //     //if ch is not present getOrDefault(ch,0) returns 0 and increment 



        // }
        // for(int i=0;i<s.length();i++){
        //     if(hash.get(s.charAt(i))==1){
        //         return i;
        //     }
        // }
        // return -1;


        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;


        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }

        return -1;
        
       
        
        
       
        
    }
}
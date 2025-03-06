class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        char[] jewelsc=jewels.toCharArray();
        char[] stonesc=stones.toCharArray();
        int output=0;


        HashSet<Character> hash=new HashSet<>();
        for (char ch:jewelsc){
            hash.add(ch);
        }

        for(char ch:stonesc){
            if(hash.contains(ch)){
                output++;
            }
        }
        return output;

        
        

    }
}
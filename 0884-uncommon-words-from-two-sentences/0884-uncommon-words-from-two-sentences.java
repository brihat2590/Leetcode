class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] ss=(s1+" "+s2).split(" ");
        HashSet<String> set=new HashSet<>();
        HashSet<String> duplicated=new HashSet<>();
        for(String word:ss){
            if(!set.add(word)){
                duplicated.add(word);

            }
        }
        set.removeAll(duplicated);
        return set.toArray(new String[0]);
        

        
        
    }
}
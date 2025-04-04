class Solution {
    public String reverseWords(String s) {
        String trimmed=s.trim();
        String[] words = trimmed.split("\\s+"); 
        Collections.reverse(Arrays.asList(words));
        String result=String.join(" ",words);

        return result;
        
        
    }
}
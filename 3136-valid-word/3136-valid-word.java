class Solution {
    public boolean isValid(String word) {
        int consonant=0;
        int vowel=0;
        word=word.toLowerCase();

        if(word.length()<3) return false;

        
        char[] ch=word.toCharArray();
        
        
        for(char c:ch){
            
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
            if(Character.isLetter(c)&&!isVowel(c)){
                consonant++;

            }
            else if(Character.isLetter(c)){
                vowel++;
            }


        }
        return vowel>=1&&consonant>=1;


       
        
    }
     public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
    
}

class Solution {
    public String reverseOnlyLetters(String s) {
        String haha=reverse(s);
        return haha;
        
        
    }
    private String reverse(String s){
        StringBuilder letter=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                letter.append(c);

            }
        }
        letter.reverse();
        int index=0;
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                result.append(letter.charAt(index++));
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();

    }
}
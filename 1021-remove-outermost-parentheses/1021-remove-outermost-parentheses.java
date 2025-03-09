class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sh=new StringBuilder();
        int opencount=0;
        for(char c:s.toCharArray()){
            if(c=='('&& opencount++>0){
                sh.append(c);
            }
            else if(c==')'&& opencount-->1){
                sh.append(c);
            }
        }
        return sh.toString();
}}
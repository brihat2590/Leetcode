class Solution {
    public boolean isValid(String s) {
        Stack<Character> stc=new Stack<>();

        for(Character ch:s.toCharArray()){
            if(ch=='('|| ch=='{'||ch=='['){
                stc.push(ch);
            }

            else{
                if(stc.isEmpty()){
                    return false;
                }
                char top=stc.pop();
                if(ch==')' && top!='('){
                    return false;
                }
                if(ch=='}' && top!='{'){
                    return false;
                }
                if(ch==']' && top!='['){
                    return false;
                }
            }
        }
        if(stc.isEmpty()){
            return true;
        }
        return false;
    }
    
}
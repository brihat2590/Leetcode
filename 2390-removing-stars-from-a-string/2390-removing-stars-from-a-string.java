class Solution {
    public String removeStars(String s) {
        ArrayDeque<Character> stack=new ArrayDeque<>();

        for(Character c:s.toCharArray()){
            if(c=='*'){
                stack.pop();
                
            }
            else{
                stack.push(c);
            }
            
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
        
    }
}
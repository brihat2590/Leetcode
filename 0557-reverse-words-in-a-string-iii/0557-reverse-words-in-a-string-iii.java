class Solution {
    public String reverseWords(String s) {
        String[] sh=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String sh1:sh){
            result.append(new StringBuilder(sh1).reverse()).append(" ");
            

        }
        return result.toString().trim();
    }  

         

        

     
    
}
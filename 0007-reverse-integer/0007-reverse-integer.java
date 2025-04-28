class Solution {
    public int reverse(int x) {
        //check if negative cha chaina
        boolean isNegative = x < 0;

        // - sign hatayo
        String s=Integer.toString(Math.abs(x));
        StringBuilder str=new StringBuilder();
        str.append(s);
        String reversedString=str.reverse().toString();
         try {
            int reversed = Integer.parseInt(reversedString);
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;
        }


        
    }
}
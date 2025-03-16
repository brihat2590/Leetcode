class Solution {
    public boolean judgeCircle(String moves) {
        int countX=0;
        int countY=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                countX++;
            }
            else if(ch=='D'){
                countX--;
            }
            else if(ch=='L'){
                countY--;
            }
            else{
                countY++;
            }
        }
        return(countX==0 && countY==0);
        
        
    }
}
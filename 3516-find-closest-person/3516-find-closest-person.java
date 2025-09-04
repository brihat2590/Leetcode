class Solution {
    public int findClosest(int x, int y, int z) {
        int xdis=Math.abs(z-x);
        int ydis=Math.abs(z-y);
        if(xdis<ydis){
            return 1;
        }
        else if(ydis<xdis){
            return 2;
        }
        return 0;
        
    }
    
}
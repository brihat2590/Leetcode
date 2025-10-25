class Solution {
    public int totalMoney(int n) {

        int total=0;
        int weekStart=1;
        int daily;

        for(int i=1;i<=n;i++){

            daily=(i-1)%7;// ie (1-1)%7 =0 (2-1)%7=1 (3-1)%7=2 
            // add bhirakhyo harek days ma;

            total=total+weekStart+daily;

            if(i%7==0){
                weekStart++;
                //week sakkio
            }
        }
        return total;


        
    }
}
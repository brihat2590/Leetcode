class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int count=0;
         boolean[] isPrime=new boolean[n];

         Arrays.fill(isPrime,true);
         //sablai true haldiney initially ani tesko 2,3,5
         //factors lai negative
         isPrime[0]=false;
         isPrime[1]=false;
         //0 ra 1 ta np nai ho
         //loop aba 2 bata end samma

         for(int i=2;i<n;i++){
            if(isPrime[i]){
                //true cha bhane rakh ani factors hataidiney

                for(int j=i*2;j<n;j=j+i){
                    isPrime[j]=false;

                }
            }
         }
         for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
         }

         return count;


        
        
    }
}
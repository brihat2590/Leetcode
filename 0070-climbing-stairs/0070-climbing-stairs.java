class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        if(n<=2)return n;
        // if(hash.containsKey(n)) return hash.get(n);
        // int result=climbStairs(n-1)+climbStairs(n-2);
        // hash.put(n,result);
        // return result;
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;

        
    }
}
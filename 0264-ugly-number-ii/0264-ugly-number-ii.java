class Solution {
    public int nthUglyNumber(int n) {
        if(n==1) return 1;

        int firstUgly=1;
        int [] ugly=new int[n];

        int i2=0,i3=0,i5=0;
        int multipleOf2=2;
        int multipleOf3=3;
        int multipleOf5=5;

        for( int i=1;i<n;i++){
            int nextUgly=Math.min(multipleOf2,Math.min(multipleOf3,multipleOf5));
            ugly[i]=nextUgly;
            if(nextUgly==multipleOf2){
                i2++;
                multipleOf2=ugly[i2]*2;

            }
            if (nextUgly == multipleOf3) {
                i3++;
                multipleOf3 = ugly[i3] * 3;
            }
            if (nextUgly == multipleOf5) {
                i5++;
                multipleOf5 = ugly[i5] * 5;
            }
        }
        return ugly[n-1];
    }
}
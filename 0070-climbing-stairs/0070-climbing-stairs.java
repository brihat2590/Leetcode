class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1; // ways to reach step 0 and step 1
        for (int i = 0; i < n; i++) {
            b = a + b; // current ways = previous two
            a = b - a; // shift
        }
        return a;
    }
}

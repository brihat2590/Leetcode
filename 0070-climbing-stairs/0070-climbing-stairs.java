class Solution {
    static int[] dp;

    public int climbStairs(int n) {
        // Initialize dp array once
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return helper(n);
    }

    private int helper(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Memoization check
        if (dp[n] != -1) {
            return dp[n];
        }

        // Recursive relation
        dp[n] = helper(n - 1) + helper(n - 2);
        return dp[n];
    }
}

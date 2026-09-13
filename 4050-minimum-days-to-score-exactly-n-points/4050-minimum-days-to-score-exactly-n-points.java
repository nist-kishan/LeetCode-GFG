class Solution {
    public int minDays(int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(n, dp);
    }

    private int helper(int score, int[] dp) {
        if (score == 0) return -1;

        if (dp[score] != -1) {
            return dp[score];
        }

        int ans = Integer.MAX_VALUE;

        for (int k = 1; ; k++) {
            int sum = k * (k + 1) / 2;

            if (sum > score) break;

            if (sum == score) {
                ans = Math.min(ans, k);
            } else {
                ans = Math.min(ans,
                        k + 1 + helper(score - sum, dp));
            }
        }

        return dp[score] = ans;
    }
}
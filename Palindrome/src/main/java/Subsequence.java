public class Subsequence {
    public int getLongestSubsequenceLength(String string) {
        int length = string.length();
        int[][] dp = new int[length][length];
        //初始化
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
        }
        //递推 i is for head,j is for tail of current subsequence
        for (int i = length - 1; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        //返回结果
        return dp[0][length - 1];
    }
}

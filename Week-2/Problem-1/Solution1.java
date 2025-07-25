public class Solution1 {
    public static int approach1(String a, String b, String c, int i, int j, int k) {
        if (i == a.length() || j == b.length() || k == c.length())
            return 0;

        if (a.charAt(i) == b.charAt(j) && b.charAt(j) == c.charAt(k)) {
            return 1 + approach1(a, b, c, i + 1, j + 1, k + 1);
        }

        return Math.max(
                Math.max(approach1(a, b, c, i + 1, j, k), approach1(a, b, c, i, j + 1, k)),
                approach1(a, b, c, i, j, k + 1));
    }

    public static int approach2(String a, String b, String c) {
        int[][][] dp = new int[a.length()][b.length()][c.length()];
        for (int[][] mat : dp)
            for (int[] row : mat)
                java.util.Arrays.fill(row, -1);

        return helper1(a, b, c, 0, 0, 0, dp);
    }

    public static int helper1(String a, String b, String c, int i, int j, int k, int[][][] dp) {
        if (i == a.length() || j == b.length() || k == c.length())
            return 0;

        if (dp[i][j][k] != -1)
            return dp[i][j][k];

        if (a.charAt(i) == b.charAt(j) && b.charAt(j) == c.charAt(k)) {
            dp[i][j][k] = 1 + helper1(a, b, c, i + 1, j + 1, k + 1, dp);
        } else {
            dp[i][j][k] = Math.max(
                    Math.max(helper1(a, b, c, i + 1, j, k, dp), helper1(a, b, c, i, j + 1, k, dp)),
                    helper1(a, b, c, i, j, k + 1, dp));
        }

        return dp[i][j][k];
    }

    public static int approach3(String a, String b, String c) {
        int n = a.length(), m = b.length(), p = c.length();
        int[][][] dp = new int[n + 1][m + 1][p + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= p; k++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1) && b.charAt(j - 1) == c.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(
                                Math.max(dp[i - 1][j][k], dp[i][j - 1][k]),
                                dp[i][j][k - 1]);
                    }
                }
            }
        }

        return dp[n][m][p];
    }

    public static void main(String[] args) {
        String a = "abc", b = "abc", c = "abc";
        System.out.println(approach1(a, b, c, 0, 0, 0));
        System.out.println(approach2(a, b, c));
        System.out.println(approach3(a, b, c));
    }
}

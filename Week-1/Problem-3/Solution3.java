public class Solution3 {

    public static int approach1(int[][] costs) {
        return helper1(costs, 0, -1);
    }

    public static int helper1(int[][] costs, int house, int prevColor) {
        if (house == costs.length)
            return 0;

        int minCost = Integer.MAX_VALUE;
        for (int color = 0; color < costs[0].length; color++) {
            if (color != prevColor) {
                int cost = costs[house][color] + helper1(costs, house + 1, color);
                minCost = Math.min(minCost, cost);
            }
        }
        return minCost;
    }

    public static int approach2(int[][] costs) {
        int n = costs.length;
        int k = costs[0].length;
        Integer[][] dp = new Integer[n][k + 1];
        return helper2(costs, 0, -1, dp);
    }

    public static int helper2(int[][] costs, int house, int prevColor, Integer[][] dp) {
        if (house == costs.length)
            return 0;

        int prev = prevColor == -1 ? costs[0].length : prevColor;
        if (dp[house][prev] != null)
            return dp[house][prev];

        int minCost = Integer.MAX_VALUE;
        for (int color = 0; color < costs[0].length; color++) {
            if (color != prevColor) {
                int cost = costs[house][color] + helper2(costs, house + 1, color, dp);
                minCost = Math.min(minCost, cost);
            }
        }

        dp[house][prev] = minCost;
        return minCost;
    }

    public static int approach3(int[][] costs) {
        int n = costs.length;
        int k = costs[0].length;
        int[][] dp = new int[n][k];

        for (int color = 0; color < k; color++) {
            dp[0][color] = costs[0][color];
        }

        for (int house = 1; house < n; house++) {
            for (int color = 0; color < k; color++) {
                dp[house][color] = Integer.MAX_VALUE;
                for (int prevColor = 0; prevColor < k; prevColor++) {
                    if (color != prevColor) {
                        dp[house][color] = Math.min(dp[house][color],
                                costs[house][color] + dp[house - 1][prevColor]);
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int color = 0; color < k; color++) {
            result = Math.min(result, dp[n - 1][color]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] costs = {
                { 1, 5, 3 },
                { 2, 9, 4 }
        };

        System.out.println(approach1(costs));
        System.out.println(approach2(costs));
        System.out.println(approach3(costs));
    }
}

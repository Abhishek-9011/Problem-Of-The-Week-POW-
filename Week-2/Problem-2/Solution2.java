import java.util.*;

public class Solution2 {
    public static int approach1(int[] coins) {
        Set<Integer> reachable = new HashSet<>();
        generateSubsets(coins, 0, 0, reachable);

        int sum = 1;
        while (reachable.contains(sum)) {
            sum++;
        }
        return sum;
    }

    public static void generateSubsets(int[] coins, int i, int currentSum, Set<Integer> reachable) {
        if (i == coins.length) {
            reachable.add(currentSum);
            return;
        }
        generateSubsets(coins, i + 1, currentSum, reachable);
        generateSubsets(coins, i + 1, currentSum + coins[i], reachable);
    }

    public static int approach2(int[] coins) {
        int total = 0;
        for (int coin : coins)
            total += coin;

        boolean[] dp = new boolean[total + 2];
        dp[0] = true;

        for (int coin : coins) {
            for (int i = total; i >= coin; i--) {
                if (dp[i - coin])
                    dp[i] = true;
            }
        }

        for (int i = 1; i <= total + 1; i++) {
            if (!dp[i])
                return i;
        }

        return total + 1;
    }

    public static int approach3(int[] coins) {
        int res = 1;

        for (int coin : coins) {
            if (coin > res)
                break;
            res += coin;
        }

        return res;
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 3, 10 };
        System.err.println(approach1(coins));
        System.err.println(approach2(coins));
        System.err.println(approach3(coins));
    }
}

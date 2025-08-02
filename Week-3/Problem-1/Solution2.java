import java.util.Arrays;

public class Solution2 {

    public static boolean approach1(int[] arr, int index, int sum1, int sum2) {
        if (index == arr.length) {
            return sum1 == sum2;
        }

        boolean option1 = approach1(arr, index + 1, sum1 + arr[index], sum2);

        boolean option2 = approach1(arr, index + 1, sum1, sum2 + arr[index]);

        return option1 || option2;
    }

    public static boolean approach2(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 11, 5 };
        int[] arr2 = { 1, 2, 3, 5 };
        System.out.println(approach1(arr1, 0, 0, 0));
        System.out.println(approach1(arr2, 0, 0, 0));
        System.out.println(approach2(arr1));
        System.out.println(approach2(arr2));
    }
}

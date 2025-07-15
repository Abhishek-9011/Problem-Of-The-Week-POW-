import java.util.*;

public class Solution2 {

    public static int approach1(int[] arr, int k) {
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int approach2(int[] arr, int k) {
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int approach3(int[] arr, int k) {
        int cnt = 0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (preSum.containsKey(sum - k)) {
                cnt += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 3;
        System.out.println(approach1(arr, k));
        System.out.println(approach2(arr, k));
        System.out.println(approach3(arr, k));
    }
}

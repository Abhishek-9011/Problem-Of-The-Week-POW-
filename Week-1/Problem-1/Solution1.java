public class Solution1 {

    public static int approach1(int[] arr) {
        int minEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }
        return minEle;
    }

    public static int approach2(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[mid]) {

                ans = Math.min(ans, arr[low]);

                low = mid + 1;
            } else {

                ans = Math.min(ans, arr[mid]);

                high = mid - 1;
            }
        }
        return ans;
    }

    public static int approach3(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] <= arr[high]) {
                ans = Math.min(ans, arr[low]);
                break;
            }

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
        System.out.println(approach3(arr));
    }
}

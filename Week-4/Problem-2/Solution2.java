public class Solution2 {
    public static boolean approach1(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==target)    return true;
            if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {-5, -2, 0, 3, 7, 10, 15};
        System.err.println(approach1(arr, 7));
    }
}

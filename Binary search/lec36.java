//Binary search
public class lec36 {
    static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int startIndex = 0;
        int endIndex = n - 1;
        int mid = (startIndex + endIndex) / 2;
        while (startIndex <= endIndex) {
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) { // mid k right m
                startIndex = mid + 1;
            } else { // mid k left m
                endIndex = mid - 1;
            }
            mid = (startIndex + endIndex) / 2;

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int target = 60;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
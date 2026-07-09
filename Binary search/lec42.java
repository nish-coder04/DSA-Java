//Painter partition
public class lec42 {
    static boolean isValidTime(int[] arr, int k, int mid) {
        int painterCount = 1;
        int wall = 0;
        for (int i = 0; i < arr.length; i++) {
            if (wall + arr[i] <= mid) {
                wall = wall + arr[i];
            } else {
                painterCount++;
                if (painterCount > k || arr[i] > mid) {
                    return false;
                } else {
                    wall = 0;
                    wall = wall + arr[i];
                }
            }
        }
        return true;
    }

    static int minTime(int[] arr, int k) {
        int n = arr.length;
        int s = 1;
        int answer = -1;
        if (n < k) {
            return answer;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidTime(arr, k, mid)) {
                answer = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int k = 2;
        int finaAns = minTime(arr, k);
        System.out.println(finaAns);
    }
}

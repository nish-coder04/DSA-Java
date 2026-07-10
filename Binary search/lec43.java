
//Aggressive cows
import java.util.Arrays;

public class lec43 {
    static boolean isValidDistance(int[] arr, int k, int mid) {
        int cow = 1;
        int lastPos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                cow++;
                lastPos = arr[i];
            }
            if (cow >= k) {
                return true;
            }
        }
        return false;
    }

    static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int s = 0;
        int maxDistance = arr[arr.length - 1] - arr[0];
        int e = maxDistance;
        int answer = -1;
        if (k > arr.length) {
            return answer;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidDistance(arr, k, mid)) {
                answer = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 4, 9 };
        int k = 3;
        int finalAns = aggressiveCows(arr, k);
        System.out.println(finalAns);
    }
}
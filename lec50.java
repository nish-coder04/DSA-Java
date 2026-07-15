//Unbounded search
public class lec50 {
    static boolean isPresent(int[] arr, int target) {
        boolean ans = false;
        if (arr[0] == target) {
            ans = true;
            return ans;
        }
        int i = 1;
        while (arr[i] <= target) {
            i = i * 2;
        }
        if (arr[i] > target) {
            int s = i / 2;
            int e = i;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] == target) {
                    ans = true;
                    return ans;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        } else {
            return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int target = 9;
        boolean finalAnswer = isPresent(arr, target);
        System.out.println(finalAnswer);
    }
}

//Unbounded search
public class lec50 {
    static boolean isPresent(int[] arr, int target) {
        if (arr[0] == target)
            return true;

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }
        int e = Math.min(i, arr.length - 1);
        int s = i / 2;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int target = 9;
        System.out.println(isPresent(arr, target));
    }
}
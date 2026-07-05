//Lower bound
/*public class lec37 {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5 };
        int target = 3;
        int output = getLowerBound(arr, target);
        System.out.println(output);

    }
}*/

//Upper Bound
public class lec37 {
    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 3, 4, 5 };
        int target = 3;
        int output = getUpperBound(arr, target);
        System.out.println(output);

    }
}

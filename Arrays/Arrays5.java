
//Missing Elements from Array of Duplicates
import java.util.HashSet;

public class Arrays5 {
    static int findMissing(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 5, 6 };
        int n = arr.length;
        int missing = findMissing(arr, n);
        if (missing != -1) {
            System.out.println("Missing element is: " + missing);
        } else {
            System.out.println("No missing element found.");
        }
    }

}

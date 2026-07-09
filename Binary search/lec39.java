//Find the pivot index of a rotated array
/*public class lec39 {
    static int findPivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int finalAns = -1;
        if (arr[s] < arr[e]) {
            return finalAns;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                finalAns = mid;
                s = mid + 1;
            }
        }
        return finalAns;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
        int output = findPivotIndex(arr);
        System.out.println(output);
    }
}*/

//Search in sorted rotated array
public class lec39 {
    static int findPivotIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int answer = -1;
        if (arr[s] < arr[e]) {
            return answer;

        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                answer = mid;
                s = mid + 1;
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int output = findTargetIndex(arr, target);
        System.out.println(output);

    }
}
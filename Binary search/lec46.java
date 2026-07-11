//Find an element in a nearly sorted array
public class lec46 {
    static int indexOfTarget(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int answer = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                answer = mid;
            }
            if (arr[mid - 1] == target) {
                answer = mid - 1;
            }
            if (arr[mid + 1] == target) {
                answer = mid + 1;
            }
            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 50, 40, 70, 60, 80 };
        int target = 50;
        int finalAns = indexOfTarget(arr, target);
        System.out.println(finalAns);
    }
}

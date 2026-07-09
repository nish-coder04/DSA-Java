//Book Allocation
public class lec41 {
    static boolean isValidAns(int[] arr, int k, int maxPages) {
        int studentCount = 1;
        int pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages) {
                pages = pages + arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }

    static int findPages(int[] arr, int k) {
        int n = arr.length;
        int s = 1;
        int answer = -1;
        if (n < k) {
            return answer;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int e = sum;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(arr, k, mid)) {
                answer = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 67, 90 };
        int finalAns = findPages(arr, 2);
        System.out.println(finalAns);
    }
}

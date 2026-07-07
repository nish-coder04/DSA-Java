//find peak index in mountain array
public class lec38 {
    static int peakElementIndex(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int peakIndex = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                peakIndex = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return peakIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 15, 4, 2 };
        int answer = peakElementIndex(arr);
        System.out.println(answer);
    }
}
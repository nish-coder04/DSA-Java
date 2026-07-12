//Find single non duplicating element
public class lec47 {
    static int singleNonDuplicate(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int answer = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) {
                answer = arr[s];
                return answer;
            }
            int currentValue = arr[mid];
            int prevValue = -1;
            if (mid - 1 >= 0) {
                prevValue = arr[mid - 1];
            }
            int nextValue = -1;
            if (mid + 1 < arr.length) {
                nextValue = arr[mid + 1];
            }
            if (currentValue != prevValue && currentValue != nextValue) {
                answer = currentValue;
                return answer;
            } else if (currentValue == prevValue) {
                s = mid + 1;
            } else if (currentValue == nextValue) {
                e = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        int finalAnswer = singleNonDuplicate(arr);
        System.out.println(finalAnswer);
    }
}

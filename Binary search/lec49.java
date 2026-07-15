//Row with max 1's
public class lec49 {
    static int getFirstOccIndec(int[][] arr, int rowIndex) {
        int totalRow = arr.length;
        int totalColumn = arr[0].length;
        int ans = -1;
        if (arr[rowIndex][totalColumn - 1] == 0) {
            return totalColumn;
        } else {
            int s = 0;
            int e = totalColumn - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }
        return ans;
    }

    static int rowMax1(int[][] arr) {
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            int index = getFirstOccIndec(arr, i);
            int Count1 = arr[0].length - index;
            if (Count1 > max1) {
                max1 = Count1;
            }
        }
        return max1;
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 1, 1 }, { 0, 1, 1, 1 }, { 0, 0, 0, 1 }, { 1, 1, 1, 1 } };
        int finalAns = rowMax1(arr);
        System.out.println(finalAns);
    }
}
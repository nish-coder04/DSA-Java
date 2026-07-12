//Search in a 2D array -> level - 1
/*public class lec48 {
    static boolean findTarget(int[][] arr, int target) {
        int totalRow = arr.length;
        int totalcolumn = arr[0].length;
        int n = totalRow * totalcolumn;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int rowIndex = mid / totalcolumn;
            int columnIndex = mid % totalcolumn;
            if (arr[rowIndex][columnIndex] == target) {
                return true;
            } else if (arr[rowIndex][columnIndex] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 11;
        boolean finalAns = findTarget(arr, target);
        System.out.println(finalAns);
    }
}*/

// Search in a 2D array -> level - 2
public class lec48 {
    static boolean findtarget(int[][] arr, int target) {
        int rowIndex = 0;
        int columnIndex = arr[0].length - 1;
        while (rowIndex < arr.length && columnIndex >= 0) {
            if (arr[rowIndex][columnIndex] == target) {
                return true;
            } else if (arr[rowIndex][columnIndex] < target) {
                rowIndex++;
            } else {
                columnIndex--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 9;
        boolean answer = findtarget(arr, target);
        System.out.println(answer);
    }
}

//Print the sum of each row in a 2D array
/*import java.util.ArrayList;
import java.util.List;

public class Array2D {
    static List<Integer> rowSums(int[][] arr) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sums.add(sum);
        }
        return sums;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> sums = rowSums(arr);
        System.out.println(sums);
    }
}*/

//Print the sum of each column in a 2D array
/*import java.util.ArrayList;
import java.util.List;

public class Array2D {
    static List<Integer> columnSums(int[][] arr) {
        List<Integer> sums = new ArrayList<>();
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            sums.add(sum);
        }
        return sums;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> results = columnSums(arr);
        System.out.println(results);
    }
}*/

//Wave print a matrix
/*import java.util.ArrayList;
import java.util.List;

public class Array2D {
    List<Integer> wavePrint(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    result.add(arr[i][j]);
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    result.add(arr[i][j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Array2D array2D = new Array2D();
        List<Integer> result = array2D.wavePrint(arr);
        System.out.println(result);
    }
}*/

//Transpose of a matrix
/*import java.util.Arrays;

public class Array2D {
    static int[][] transpose(int[][] arr) {
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] transposed = transpose(arr);
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}*/

// rotate by 90degrees
/*import java.util.Arrays;

public class Array2D {
    static void rotate90(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[0].length - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate90(arr);
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}*/

//Spiral print of a matrix
import java.util.ArrayList;

public class Array2D {
    static ArrayList<Integer> spiralPrint(int[][] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // loop 1 - left to right row wise
            for (int i = startCol; i <= endCol; i++) {
                result.add(arr[startRow][i]);
            }
            startRow++;
            // loop 2 - top to bottom column wise
            for (int j = startRow; j <= endRow; j++) {
                result.add(arr[j][endCol]);
            }
            endCol--;
            // loop 3 - right to left row wise
            for (int k = endCol; k >= startCol; k--) {
                result.add(arr[endRow][k]);
            }
            endRow--;
            // loop 4 - bottom to top column wise
            for (int l = endRow; l >= startRow; l--) {
                result.add(arr[l][startCol]);
            }
            startCol++;

        }
        return result;
    }

    public static void main(String[] arg) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        ArrayList<Integer> result = spiralPrint(arr);
        System.out.println(result);

    }
}
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

import java.util.Arrays;

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
}
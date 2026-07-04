/*public class setMatrixZero {
  public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    int row = i;
                    int column = j;
                    matrix[row][j] = 0;
                    matrix[i][column] = 0;
                }
            }
        }
        System.out.println("Matrix after setting zeroes:");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setMatrixZero smz = new setMatrixZero();
        smz.setZeroes(matrix);
    }
}*/

public class setMatrixZero {
    static double myPow(double x, int n) {
        double result = 1;
        if (n == 0) {
            result = 1;
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * x;
            }
        }else {
            for (int i = 1 ; i <= -(n);i++){
                result = 1/(result*x);
            }
        }
        return result;
    }

}
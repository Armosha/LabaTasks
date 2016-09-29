package Task6;


public class Matrix {

    public static int[][] getMatrix(int[] arr, int[][] matrix) {

      //  int[] arr;
      //  int[][] matrix;

      //  matrix = new int[9][9];
     //   arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (j + n < matrix.length) {
                    matrix[i][j] = arr[j + n];
                } else {
                    matrix[i][j] = arr[m];
                    m++;
                }
            }
            n++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("  " + matrix[j][i]);
            }
            System.out.println();
        }

        return matrix;
    }
}


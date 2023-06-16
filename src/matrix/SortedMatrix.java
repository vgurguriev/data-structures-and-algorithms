package matrix;

public class SortedMatrix {
    public static void main(String[] args) {
        // initialize sorted matrix
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        SortedMatrix sm = new SortedMatrix();
        sm.search(matrix, 29);
        sm.printMatrixSpiral(matrix);
    }

    public void search(int[][] matrix, int key) {
        int i = 0; // row
        int j = matrix.length - 1; // col

        // start from top right corner
        // if key is greater than current element, then it can't be in that row
        // if key is smaller than current element, then it can't be in that column
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == key) {
                System.out.println("Found at (" + i + ", " + j + ")");
                return;
            } else if (matrix[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not found");
    }

    public void printMatrixSpiral(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix.length - 1;

        while (top <= bottom && left <= right) {
            // print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
}

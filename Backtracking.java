public class Backtracking {

    public static boolean isSafe(int arr[][], int row, int col) {
        for (int i = 0; i < col; i++) {
            if (arr[row][i] == 1) {
                return false;
            }
        }

        for (int i = row; i > 0; i--) {
            for (int j = col; j > 0; j--) {
                if (arr[i][j] == 1) {
                    return false;
                }
            }
        }

        // diagonal left side
        for (int i=row, j=col; i>=0 && j>=0; i--,j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        // diagonal right side
        for (int i=row, j=col; i>=0&& j>=0; i++,j--) {
            if (arr[i][col] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueen(int arr[][], int col, int N) {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(arr, i, col)) {
                arr[i][col] = 1;
            }
            if (nQueen(arr, col + 1, N) == true)
                return true;

            arr[i][col] = 0; // Backtrack
        }

        return false;

    }

    public static boolean isPossible(int arr[][], int i) {
        return true;
    }

    public static void sudoku(int arr[][], int n) {

    }

    public static void main(String[] args) {

        int arr[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
        int queen = 4;

        System.out.println(nQueen(arr, arr.length, queen));
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatrixZero {

    public static void convertArray(int[][] arr, int row, int col) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < c; i++) {
            arr[row][i] = 0;

        }
        for (int i = 0; i < r; i++) {
            arr[i][col] = 0;
        }

    }

    public static int[][] zeroArray(int[][] arr) {
        Set<int[]> mp = new HashSet<>();

        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    int[] pair = new int[] { i, j };
                    mp.add(pair);
                }
            }
        }

        // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        // System.out.println(entry.getKey() + "___" + entry.getValue());
        // convertArray(arr, entry.getKey(), entry.getValue());
        // }

        for (int[] e : mp) {
            convertArray(arr, e[0], e[1]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] m1 = { { 1, 1, 2, 5 }, { 3, 0, 5, 2 }, { 1, 3, 1, 5 } };

        int[][] ans = zeroArray(m1);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }

    }
}

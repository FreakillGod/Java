package DFS;

public class LongstIncPath {

    public static int dfs(int arr[][], int map[][], int row, int col) {
        int left = 0;
        int right = arr[0].length;
        int top = 0;
        int bottom = arr.length;
        int temp = 1;
        int val1 = 0, val2 = 0, val3 = 0, val4 = 0;

        if (row >= top && row <= bottom) {
            if ((row - 1) >= 0 && arr[row - 1][col] > arr[row][col]) {
                val1 = Math.max(dfs(arr, map, row - 1, col), temp);
            }

            if ((row + 1) < bottom && arr[row + 1][col] > arr[row][col]) {
                val2 = Math.max(dfs(arr, map, row + 1, col), temp);
            }
        }

        if (col >= left && col <= right) {

            if ((col - 1) >= 0 && arr[row][col - 1] > arr[row][col]) {
                val3 = Math.max(dfs(arr, map, row, col - 1), temp);
            }
            if ((col + 1) < right && arr[row][col + 1] > arr[row][col]) {
                val4 = Math.max(dfs(arr, map, row, col + 1), temp);
            }
        }

        temp = Math.max(Math.max(val1, val2), Math.max(val4, val3)) + temp;

        map[row][col] = temp;

        return temp;
    }

    public static int findLongestPath(int arr[][]) {
        int max = 0;

        int map[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dfs(arr, map, i, j);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max, map[i][j]);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[][] = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };

        System.out.println(findLongestPath(arr));
    }
}

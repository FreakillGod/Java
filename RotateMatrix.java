public class RotateMatrix {
    public static int[][] rotateRec(int[][] arr) {

        int ans[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int right = arr[i].length - 1;
            int left = 0;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int ans[][] = rotateRec(arr);
        // for (int i = 0; i < ans.length; i++) {
        // for (int j = 0; j < ans[i].length; j++) {
        // System.out.print(ans[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
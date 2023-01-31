package Matrix;

public class UniquePathLeftRigthToTopBottom {

    public static int findAllTopToBottomPath(int row, int col) {

        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = 1;
                } else {
                    if (i == 0) {
                        arr[i][j] = arr[i][j - 1];
                    } else if (j == 0) {
                        arr[i][j] = arr[i - 1][j];
                    } else {
                        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];

                    }

                }

            }
        }

        return arr[row - 1][col - 1];
    }

    public static void main(String[] args) {
        System.out.println(findAllTopToBottomPath(3, 7));
    }
}

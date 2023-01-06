public class PascalsTri {

    public static int[] getNumbers(int num) {

        int arr[][] = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 1) {
                    arr[i][j] = 1;
                }
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j-1] + arr[i - 1][j];
                }

            }
        }

        return arr[num-1];
    }

    public static void main(String[] args) {

        int num = 6;

        int[] arr= getNumbers(num);

        for(int i=0; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}

public class StockBuySell {

    public static int findStockBestPrice(int arr[], int n) {

        int max = 0;
        int curmax = arr[n - 1];
        int diff = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < curmax) {
                diff = Math.max(curmax - arr[i], diff);
            } else {
                curmax = arr[i];
            }

        }

        return diff;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 4, 5, 8, 6, 7 };

        System.out.println(findStockBestPrice(arr, arr.length));
    }
}

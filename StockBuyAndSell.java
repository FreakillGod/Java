public class StockBuyAndSell {

    public static void findMinandmax(int arr[], int n) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + "min and max" + max);
    }

    public static void stockOne(int arr[], int n) {
        int maxProfit = 0;
        int minSofar = arr[0];

        for (int i = 0; i < n; i++) {
            int profit = arr[i] - maxProfit;
            minSofar = Math.min(arr[i], minSofar);
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }

    public static int maxProfit(int arr[], int n) {

        int minSoFar = Integer.MAX_VALUE;
        int highestProfit = 0;

        for (int i = 0; i < n; i++) {
            // check if array has new minimum value
            if (arr[i] < minSoFar) {
                minSoFar = arr[i];
            }
            // compare the profit by subtracting it with the minvalue and current max
            if (arr[i] - minSoFar > highestProfit) {
                highestProfit = arr[i] - minSoFar;
            }
        }

        return highestProfit;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 4, 3, 7, 2, 5 };

        System.out.println(maxProfit(arr, arr.length));
        findMinandmax(arr, arr.length);
    }
}
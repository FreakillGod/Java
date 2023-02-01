package ARR;

public class LongestSubArrZeroSum {

    public static int findLongestRecursively(int arr[], int left, int right) {
        if (left >= right)
            return 0;

        int curr = 0;
        for (int i = left; i < right; i++) {
            curr += arr[i];
        }
        if (curr == 0)
            return ((right - 1) - left) + 1;
        else {
            int two = findLongestRecursively(arr, left + 1, right);
            int one = findLongestRecursively(arr, left, right - 1);

            return Math.max(one, two);
        }
    }

    public static int findLongestSubArrayWithZeroSum(int arr[], int n) {

        int max = findLongestRecursively(arr, 0, n);

        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 9, -3, 3, -1, 6, -5 };

        System.out.println(findLongestSubArrayWithZeroSum(arr, arr.length));

    }
}

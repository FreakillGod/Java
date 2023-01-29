public class BinaryScrhMatrix {

    public static boolean findByBinary(int arr[], int target) {

    }

    public static boolean findByBinarySearchMtx(int arr[][], int low, int high, int target) {
        int mid = arr.length / 2;

        if (target >= arr[mid][0] && target <= arr[mid][arr[mid].length - 1]) {
            return findByBinary(arr[mid], target);
        } else if (target < arr[mid][0]) {
            return findByBinarySearchMtx(arr, low, mid, target);
        } else if (target > arr[mid][arr[mid].length - 1]) {
            return findByBinarySearchMtx(arr, mid, high, target);
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };
        int low = 0;
        int high = arr.length;
    }
}

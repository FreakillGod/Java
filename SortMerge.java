public class SortMerge {

    public static void sort(int arr[], int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        int b[] = new int[arr.length];

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }

        if (j <= right) {
            while (j <= right) {
                b[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                b[k++] = arr[i++];
            }
        }

        for (int temp = left; temp <= right; temp++) {
            arr[temp] = b[temp];
        }

    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left == right)
            return;

        int mid = (right + left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        sort(arr, left, mid, right);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 9, 6, 3, 7, 8, 2 };
        int left = 0;
        int right = arr.length - 1;

        mergeSort(arr, left, right);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

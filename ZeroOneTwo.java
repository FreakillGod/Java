public class ZeroOneTwo {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortNumber(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;

        while (l <= mid && mid <= r) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, mid, l);
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, r);
                    r--;
                    break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 0, 2, 2, 2, 2, 2, 1, 1, 2, 0, 1, 2, 0, 2, 0, 1, 0 };

        sortNumber(arr);

    }
}

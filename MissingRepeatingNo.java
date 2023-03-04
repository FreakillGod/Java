import java.util.Arrays;

public class MissingRepeatingNo {

    public static int[] findRepeatAndMissing(int arr[]) {
        int ans[] = new int[2];
        Boolean flag = false;
        Arrays.sort(arr);

        int n = arr.length;

        if (arr[n - 1] != n) {
            ans[0] = n;
            flag = true;
        }

        for (int i = n - 1; i > 0; i--) {
            // System.out.println(arr[i]);
            if ((arr[i] - arr[i - 1]) != -1) {
                if ((arr[i] - arr[i - 1]) == 0) {
                    ans[1] = arr[i];
                } else {
                    if (!flag) {
                        ans[0] = arr[i];
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2, 5, 4, 6, 7, 5 };
        System.out.println(findRepeatAndMissing(arr)[0]);

    }
}

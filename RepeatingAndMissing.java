import java.util.Arrays;

public class RepeatingAndMissing {

    public static int[] findMissingandDupicate(int arr[]) {
        int dup = -1;
        int miss = -1;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 0) {
                dup = arr[i];
            }
            if (arr[i] - arr[i - 1] != 1) {
                miss = arr[i] - 1;
            } else {
                miss = arr[arr.length - 1] + 1;
            }
        }

        return new int[] { dup, miss };
    }

    public static void main(String[] args) {

        int arr[] = { 3,1,2,5,3 };

        System.out.println(findMissingandDupicate(arr)[0]);

    }
}

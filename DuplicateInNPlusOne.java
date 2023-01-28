import java.util.Arrays;

public class DuplicateInNPlusOne {

    public static int findDuplicate(int arr[]) {

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 5, 6, 8, 6, 9 };

        System.out.println(findDuplicate(arr));

    }
}

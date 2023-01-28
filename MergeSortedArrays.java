import java.util.Arrays;

public class MergeSortedArrays {

    public static void sortWithoutExtraSpace(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr2[j] < arr1[i]) {
                int temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
                i++;
            } else {
                j++;
            }
            Arrays.sort(arr2);
        }
    }

    public static void main(String[] args) {

        int arr1[] = { 2, 5, 6, 8, 9 };
        int arr2[] = { 1, 3, 4, 7 };

        sortWithoutExtraSpace(arr1, arr2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}

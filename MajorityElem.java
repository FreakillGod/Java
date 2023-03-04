public class MajorityElem {

    public static int findMajority(int[] arr) {
        int curr = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == curr) {
                count += 1;
            } else {
                count -= 1;
                if (count == 0) {
                    curr = arr[i];
                    count = 1;
                }
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 4, 4, 4, 4 };
        System.out.println(findMajority(arr));
    }
}

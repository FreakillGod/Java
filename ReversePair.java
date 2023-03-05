import java.util.ArrayList;
import java.util.List;

public class ReversePair {

    public static List<int[]> findPair(int arr[]) {

        List<int[]> ll = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j] * 2) {
                    ll.add(new int[] { arr[i], arr[j] });
                }
            }
        }

        return ll;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 4 };

        List<int[]> ll = findPair(arr);

        for (int i = 0; i < ll.size(); i++) {
            int ans[] = ll.get(i);
            System.out.println(ans[0] + "==" + ans[1]);
        }
    }
}

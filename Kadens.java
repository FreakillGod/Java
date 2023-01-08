import java.util.ArrayList;
import java.util.List;

public class Kadens {

    public static int maxSequence(int arr[]) {

        List<Integer> li = new ArrayList<>();

        int maxCount = 0;
        int currCount = 0;

        for (int i = 0; i < arr.length; i++) {
            currCount = currCount + arr[i];
            li.add(arr[i]);
            if (currCount < 0) {
                currCount = 0;
                li.clear();
            }
            if (currCount > maxCount) {
                maxCount = currCount;
            }
        }

        // for (int i=0; i<arr.length; i++){
        //     System.out.println(li.get(i));
        // }

        return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        System.out.println(maxSequence(arr));
    }
}

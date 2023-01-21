import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInntervals {

    public static ArrayList<List<Integer>> MergedIntervals(ArrayList<List<Integer>> ll) {
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < ll.size()-1; i++) {
            while ((ll.get(i).get(1)) < (ll.get(i + 1).get(1))) {
                
            }
        }
        return ans;

    }

    List<List<Integer>> ll = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[] { 1, 3 }));
        arr.add(Arrays.asList(new Integer[] { 2, 4 }));
        arr.add(Arrays.asList(new Integer[] { 2, 6 }));
        arr.add(Arrays.asList(new Integer[] { 8, 9 }));
        arr.add(Arrays.asList(new Integer[] { 8, 10 }));
        arr.add(Arrays.asList(new Integer[] { 9, 11 }));
        arr.add(Arrays.asList(new Integer[] { 15, 18 }));
        arr.add(Arrays.asList(new Integer[] { 16, 17 }));
        ArrayList<List<Integer>> ans = MergedIntervals(arr);

    }
}

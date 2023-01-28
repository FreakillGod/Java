import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInntervals {

    public static ArrayList<List<Integer>> MergedIntervals(ArrayList<List<Integer>> ll) {
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < ll.size(); i++) {
            if (ans.isEmpty()) {
                ans.add(ll.get(i));
            } else {
                int newZero = ll.get(i).get(0);
                int oldZero = ans.get(ans.size() - 1).get(0);

                int newOne = ll.get(i).get(1);
                int oldOne = ans.get(ans.size() - 1).get(1);

                if (oldOne > newZero) {
                    ans.get(ans.size() - 1).set(1, Math.max(Math.max(newZero, newOne), oldOne));
                } else {
                    ans.add(Arrays.asList(new Integer[] { newZero, newOne }));
                }

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

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).get(0) + " and " + ans.get(i).get(1));
        }

    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

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

    public static void majorityBy3(int arr[]) {

        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]] = temp[arr[i]] + 1;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > arr.length / 3) {
                System.out.println(temp[i] + "=>" + i);
            }
        }
    }

    public static ArrayList<Integer> majority3better(int[] arr) {
        ArrayList<Integer> ll = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > (arr.length / 3)) {
                ll.add(e.getKey());
            }
        }
        return ll;
    }

    public static List<Integer> majority3bymoreVoting(int arr[]) {
        int count1 = 0;
        int count2 = 0;

        int num1 = -1;
        int num2 = -2;

        List<Integer> ll = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1)
                count1++;
            if (arr[i] == num2)
                count2++;
            else if (count1 == 0) {
                num1 = arr[i];
                count1=1;
            } else if (count2 == 0) {
                num2= arr[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }

        for( int i=0 ; i< arr.length;i++){
            if(arr[i]==num1) count1++;
            if(arr[i]== num2) count2++;
        }
        if( count1 > arr.length/3){
            ll.add(num1);
        }
        if( count2 > arr.length/3){
            ll.add(num2);
        }

        return ll;
        
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 3, 4, 4, 4, 4 };
        // System.out.println(findMajority(arr));
        // majorityBy3(arr);

        List<Integer> ans = majority3bymoreVoting(new int[] { 11,33,33,11,33,11 });

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}

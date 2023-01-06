import java.util.HashMap;

public class HashProg {

    public static void findSubarray(int arr[], int req) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr+=arr[i];
            if (map.containsKey(curr - req)) {
                System.out.println(map.get(curr - req) + 1 + " : " + i);
            } else {
                map.put(curr, i);
            }
        }

        System.out.println(-1);

    }

    public static void main(String[] args) {
        int[] arr= new int[]{0,4,5,3,2,1,8};

        findSubarray(arr, 10);
    }
}

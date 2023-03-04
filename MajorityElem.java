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
            temp[arr[i]]=temp[arr[i]]+1;
        }

        for( int i=0; i<temp.length; i++){
            if(temp[i]>arr.length/3){
                System.out.println(temp[i]+ "=>"+ i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 3, 4, 4, 4, 4 };
        // System.out.println(findMajority(arr));
        majorityBy3(arr);
    }
}

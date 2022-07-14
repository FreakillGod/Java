import java.util.Arrays;
import java.util.HashSet;

public class twoSum {
    
    public static void findPair(int arr[],int sum){
        HashSet<Integer> set= new HashSet<>();

        int n=arr.length;

        for(int i=0;i<n;i++){
            int temp=Math.abs(arr[i]-sum);
                System.out.println(temp);
            if(set.contains(temp)){
                System.out.println("the pair is "+temp+" and "+arr[i]+"");
            }
            set.add(arr[i]);
        }
    }

    public static boolean threeSum(int arr[], int sum){
            Arrays.sort(arr);

            int l=0;
            int r=arr.length-1;

            for(int i=0;i<r;i++){

                while(l<r){
                    if(arr[i]+arr[r]+arr[l]==sum){
                        System.out.println(arr[i]+""+arr[r]+""+arr[l]);
                        return true;
                    }
                    if(arr[l]+arr[r]+arr[i]>sum){
                        r-=1;
                    }
                    if(arr[l]+arr[r]+arr[i]<sum){
                        l+=1;
                    }else{
                        
                    }
                }
    
            }

            return false;

    }

    public static void main(String[] args) {
        int []arr= {1,5,3,2,5,6,0,2,3,4};
        int sum=9;
        
        int arr1[]={1, 2, 3, 4, 5};
        
        findPair(arr, sum);
        System.out.println(threeSum(arr1, sum));
    }
}

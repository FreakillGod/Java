public class FindMajority {
    
    public static boolean moorsSlgorithm(int arr[]){
        int maxIdx=0;
        int count=1;

        for( int i=1; i< arr.length; i++){

            if(arr[i]==arr[maxIdx]){
                count++;
            }else{
                count--;
            }

            if(count==0){
                maxIdx=i;
                count=1;
            }

        }
        int verifycount=arr[maxIdx];
        int newCount=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]==verifycount){
                newCount++;
            }
        }
        if(newCount>=arr.length/2){
            return true;
        }else{
            return false;
        }
    }

    public static int kadensAlgo( int arr[]) {
        int max=0;
        int maxsofar=0;

        for(int i=0; i<arr.length;i++){
            maxsofar=maxsofar+arr[i];

            if(maxsofar>max){
                max=maxsofar;
            }
            if(maxsofar<0){
                maxsofar=0;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[]= {1,2,34,5,23,2,2,2,5,2,3,2,5};
        System.out.println(arr.length);
        System.out.println(moorsSlgorithm(arr));

        int arr1[]= {5,-4,-2,6,-1};
        System.out.println(kadensAlgo(arr1));
    }
}

public class StockBuyAndSell {
    
    public static int maxProfit(int arr[], int n){

        int minSoFar=Integer.MAX_VALUE;
        int highestProfit=0;

        for(int i=0;i<n;i++){
            //check if array has new minimum value
            if(arr[i]<minSoFar){
                minSoFar=arr[i];
            }
            //compare the profit by subtracting it with the minvalue and current max
            if(arr[i]-minSoFar>highestProfit){
                highestProfit=arr[i]-minSoFar;
            }
        }

        return highestProfit;
    }

    public static void main(String[] args) {
        
        int arr[]={3,1,4,3,7,2,5};

        System.out.println(maxProfit(arr, arr.length));
    }
}
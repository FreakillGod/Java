import java.util.*;

public class ReverseArray {

    public static void reverseAnArray(int arr[], int l, int r) {

        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }

    }

    static class Pair {
        int min;
        int max;
    }

    public static Pair findMaxAndMin(int arr[], int n) {

        Pair minmax = new Pair();

        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] < arr[1]) {
            minmax.min = arr[0];
            minmax.max = arr[1];
        } else {
            minmax.max = arr[0];
            minmax.min = arr[1];
        }

        for (int i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.max) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    public static void sort012(int[] arr) {
        int l = 0;
        int mid = 0;
        int h = arr.length - 1;

        while (mid <= h) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, l, mid);
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, h);
                    h--;
                    break;
            }
        }
    }

    // unionOfArray
    public static void unionOfArray(int[] a1, int[] a2) {

        Set<Integer> map1 = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            map1.add(a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            map1.add(a2[i]);
        }

        System.out.println(map1.toString());

    }

    // intersection of array
    public static void intersetionOfArray(int a1[], int a2[]) {
        Set<Integer> set = new HashSet<>();

        int max = 0;
        int count = 0;

        if (a1.length < a2.length) {
            max = a2.length;
        } else {
            max = a1.length;
        }
        for (int i = 0; i < max; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i < max; i++) {
            if (set.contains(a2[i])) {
                count = +1;
                set.remove(a2[i]);
            }
        }

        System.out.println(set.toString() + "Intersection is: ");
        System.out.println(count);
    }

    public static void rotateArray(int arr[]) {
        int n = arr.length;
        int temp = arr[0];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void rotateArrayReverse(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    //Longest common sequence
    //Kadane's Algo
    public static int LCS(int a[]){
        int total=Integer.MIN_VALUE;
        int subTotal=0;
        int n=a.length;

        for(int i=0; i<n;i++){
            subTotal=subTotal+a[i];

            if(total<subTotal)
                total=subTotal;
            
            if(subTotal<0)
                subTotal=0;
            
        }
        return total;
    }

    public static int findDuplicate(int arr[]){
        Set<Integer> set= new HashSet<>();

        for(int i=0; i<arr.length-1;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }else{
                set.add(arr[i]);
            }
        }

        return -1;
    }

    //OPEARTION REQUIRED TO MAKE AN ARRAY PALINDROME

    public static void palindromic(int arr[]){
        int i=0;
        int j=arr.length-1;
        int op=0;

        while(i<j){
            if(arr[i]<arr[j]){
                arr[i]+=arr[i+1];
                i++;
                op++;
            }else if(arr[i]>arr[j]){
                arr[j]+=arr[j-1];
                j--;
                op++;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("Number of operations: "+op);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 13, 34, 54, 23, 46, 87, 23 };

        // rever an array
        reverseAnArray(arr, 0, arr.length - 1);
        printArray(arr);

        // find min and max
        Pair minmax;
        minmax = findMaxAndMin(arr, arr.length);
        System.out.println(minmax.min + " and " + minmax.max);

        int[] arr1 = { 0, 1, 1, 0, 2, 0, 1 };
        int[] arr2 = { 13, 34, 54, 23, 46, 1, 23 };
        int[] arr3 = { 13, 23, 29, 92, 12, 15 };

        // sort 0 1 2
        sort012(arr1);
        printArray(arr1);

        // UNION and INTERSECTION of arrays
        unionOfArray(arr1, arr2);
        intersetionOfArray(arr1, arr2);

        // rotate array by one
        rotateArray(arr2);
        printArray(arr2);
        System.out.println("Rotate an array");
        rotateArrayReverse(arr3);
        printArray(arr3);

        //LCA
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Least common subSequence is: "+LCS(a));

        System.out.println(findDuplicate(arr2)+" Duplicate Element");

        //Palindromic array
        int parr[]= {1,2,4,5,2,1};
        palindromic(parr);
        
    }
}

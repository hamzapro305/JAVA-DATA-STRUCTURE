package LinearSort;

import java.util.Arrays;

public class LinearSort {

    public static void sort(int a[]){
        for(int i = 0; i < a.length; i++) {
           for (int j = 0; j < a.length; j++) {

                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

           } 
        }
    }

    public static void BinarySearch(int[] a, int s){
        //Write your Code Here
    }
    
    public void LinearSearch(int[] a, int s){
        //Write your Code Here
    }

    public static void main(String[] args){
        int arr[] = {5, 3, 1, 2, 7, 2};

        LinearSort.sort(arr);
        LinearSort.BinarySearch(arr, 5);

        LinearSort hs = new LinearSort();
        hs.LinearSearch(arr, 6);

        System.out.println("Soted Array: " + Arrays.toString(arr));
    }
}
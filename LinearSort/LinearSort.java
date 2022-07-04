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
        int si = 0;
        int ei = a.length - 1;
        int mid = (si + ei)/2;
        while(true){
            if(si > ei) { System.out.println("This item " + s + " is not in list"); return; }
            else if (s == a[mid]) { 
                System.out.println("This item " + s + " is exist in list at: " + mid); 
                return; 
            }
            else if(s > a[mid]) { si = mid + 1; }
            else if(s < a[mid]) { ei = mid - 1; }
            mid = (si + ei) / 2;
        }
    }

    public static void main(String[] args){
        int arr[] = {5, 3, 1, 2, 7, 2};

        LinearSort.sort(arr);
        LinearSort.BinarySearch(arr, 5);

        System.out.println("Soted Array: " + Arrays.toString(arr));
    }
}
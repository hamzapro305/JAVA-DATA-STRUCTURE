package BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public int BS(int[] a, int s){
        int si = 0;
        int ei = a.length - 1;
        int mid = (si + ei)/2;
        while(true){
            System.out.println(Arrays.toString(a) + " " + si + " " + ei + " " + " " + mid);
            if(si > ei) { return 0; }
            else if (s == a[mid]) { return 1; }
            else if(s > a[mid]) { si = mid + 1; }
            else if(s < a[mid]) { ei = mid - 1; }
            mid = (si + ei) / 2;
        }
    }

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
    public static void main(String[] args){
        int MyArray[] = {7, 3, 12, 2, 17, 9, 3, 13, 1};
        sort(MyArray);

        BinarySearch bs = new BinarySearch();
        int SearchedElement = bs.BS(MyArray, 9);

        // 1 is Present 
        // 0 is Absent 
        System.out.println("Your Element: " + SearchedElement);

    }
}

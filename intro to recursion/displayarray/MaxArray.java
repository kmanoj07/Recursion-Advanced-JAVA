package displayarray;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
         int res = maxOfArray(arr, 0);
        System.out.println(res);
    }
    public static int maxOfArray(int[] array, int idx) {
        if(idx == array.length -1){
            return array[idx];
        }
        // faith
        int misa = maxOfArray(array, idx +1);
        if(misa > array[idx]){
            return misa;
        } else {
            return array[idx];
        }
    }
}

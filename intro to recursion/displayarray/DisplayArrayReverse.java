package displayarray;

import java.util.Scanner;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        dispalyArrayReverse(arr, 0);
    }
    // Ex - arr[] idx se reverse print kar dega
    // faith -> arr[] idx+1, reverse print karna janata hai
    public static  void dispalyArrayReverse(int[] arr, int idx) {
        if(idx == arr.length){
            return;
        }
        dispalyArrayReverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

package displayarray;

import java.util.Scanner;

public class LastIndexOfElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int res = lastIndex(arr, 0, data);
        System.out.println(res);
    }
    // Expectation -> lastIndex(arr, 0, data) -> it will give the last occurrence of index for data.
    // faith -> lastIndex(arr, 1, data) -> it knows to get the last occurrence in the smaller array
    // faith -> expectation reach
    public static int lastIndex(int[] arr, int idx, int x) {
        if(idx == arr.length){
            return -1;
        }
        // faith
        int liisa = lastIndex(arr, idx +1, x);
        if(liisa == -1){ // it means the last index of data not found
             if(arr[idx] == x){
                 return idx;
             } else {
                 return -1;
             }
        } else {
            // lastIndex found
            return liisa;
        }
    }
}

package displayarray;

import java.util.Scanner;

public class DispalyArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        displayArray(arr, 0);
    }
    // Ex -> idx se end tak sab print kar dega
    // faith -> idx+1 se end tak sab print kar dega
    public static void displayArray(int[] arr, int idx) {
        if(idx >= arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx+1);
    }
}

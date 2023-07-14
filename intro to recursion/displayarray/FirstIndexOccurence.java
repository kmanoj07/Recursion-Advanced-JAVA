package displayarray;

import java.util.Scanner;

public class FirstIndexOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int res = firstIndex(arr, 0, data);
        System.out.println(res);
    }

    private static int firstIndex(int[] arr, int idx, int data) {
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == data){
            return idx;
        } else {
            int fiisa = firstIndex(arr, idx + 1, data);
            return fiisa;
        }
    }
}

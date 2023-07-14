package displayarray;

import java.util.Arrays;
import java.util.Scanner;

public class AllOccurenceIndexOfElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int[] res = allIndices(arr, 0, data, 0); // arr[], startindex, data, foundsofar
        System.out.println(Arrays.toString(res));
    }

    // Expectation -> allIndices(arr, 0, x, fsf) -> will found the all indices of x return arr[occurrencetime]
    // Faith -> allIndices(arr, 1, x fsf) -> It knows to find the all indices of x and return arr[occurenceTime]
    // faith -> expectation achieve
    public static int[] allIndices(int[] arr, int idx, int x, int fsf) {
        if(idx == arr.length){
            // return the array of size fsf -> base case se laut te samaye
            return new int[fsf];
        }
        // Going deep into the recurssion
        if(arr[idx] == x){
           int[] iarr =  allIndices(arr, idx+1, x, fsf+1);
           iarr[fsf] = idx;
           return  iarr;
        } else {
           int[] iarr =  allIndices(arr, idx+1, x, fsf);
           return iarr;
        }
    }
}

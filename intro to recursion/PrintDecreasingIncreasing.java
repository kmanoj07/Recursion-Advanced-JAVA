import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasingIncreasing(n);
    }

    private static void printDecreasingIncreasing(int n) { // Assumption printDecreasing(4) - 4, 3, 2, 1, 1, 2, 3, 4
        if(n== 0){
            return;
        }

        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}

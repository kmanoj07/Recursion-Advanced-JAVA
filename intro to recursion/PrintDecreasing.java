import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) { // Assumption : The method printDecreasing(n-1) - 4, 3, 2, 2
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

}
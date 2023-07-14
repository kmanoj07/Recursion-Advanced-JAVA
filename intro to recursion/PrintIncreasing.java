import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) { // Assumption: -> printIncreasing(4) -> 1, 2, 3, 4 ,  (5)
        if(n == 0){
            return;
        }
        printIncreasing(n-1); // sub problem up
        System.out.println(n); // some work  down
    }
}

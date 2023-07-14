import java.util.Scanner;

public class PrintFactorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(printFact(n));
    }

    // factorial 5 * 4 * 3 * 2 * 1
    public static int printFact(int n) { // The function with n will print fact(n)
        if(n == 0){
            return 1;
        }
        int result = n * printFact(n-1);
        return result;
    }
}

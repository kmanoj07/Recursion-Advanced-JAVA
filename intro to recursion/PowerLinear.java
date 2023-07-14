import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = power(x, n);
        if(x == 0 && n == 0){
            System.out.println(0);
            return;
        }
        System.out.println(res);
    }

    // Expectation -> power(x,, n) wil return x * x * x ......* n times
    // Faith -> power(x, n-1) will return x * x * x * ..... * n-1 times
    // Expectation  se faith - power(x, n) = power(x , n-1) * x;
    private static int power(int x, int n) { // 3, 2 -> 3, 1, 3, 0
        // base condition
        if(n == 0){
            return 1;
        }
        int pnm1 = power(x, n-1); // 3, 1, 3, 1
        int pn = pnm1 * x;
        return pn;
    }
}

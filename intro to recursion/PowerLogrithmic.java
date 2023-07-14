import java.util.Scanner;

public class PowerLogrithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = powerLog(x, n);
        if(x == 0 && n == 0){
            System.out.println(0);
            return;
        }
        System.out.println(res);
    }

    // Expectation powerLog(x, 1024) -> x * x * ............... 1024 times
    // faith power(x, 1024/2) -> x * x * x *  ..... 1024/2 times
    // Expectation -> Faith = power(x, 1024) = power(x, 1024/2) * power(x , 1024) - if (n is even)
    // Expectation -> Faith = power(x, 1024) = power(x, 1024/2) * power(x , 1024) * x - if (n is odd)
    public static int powerLog(int x, int n) { //5, 10 -> 5, 5 -> 5, 2 -> 5, 1 -> 5, 0
        if(n == 0){
          return 1;
        }
        int res = powerLog(x, n/2);
        if((n & 1) == 0) { // even
            res = res * res;
        } else {
            res = res * res * x;
        }
        return  res;
    }

}

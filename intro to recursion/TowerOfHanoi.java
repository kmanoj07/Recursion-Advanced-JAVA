import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tA = sc.nextInt();
        int tB = sc.nextInt();
        int tC = sc.nextInt();
        // n disk arranged in increasing order on tower A
        // Task: print the instruction to mover the disk from A to B using C
        // Rules: Move only 1 disk at a time
        // 2. you can put larger disk on the smaller disk
        towerHanoi(n, tA, tB, tC);
    }
    public static  void towerHanoi(int n, int tA, int tB, int tC) { // src, destination, helper
        if(n == 0){
            return;
        }
        // faith
        towerHanoi(n-1, tA, tC, tB);
        System.out.println(n + "=> [" + tA + "," + tB +"]");
        towerHanoi(n-1, tC, tB, tA);
    }
}

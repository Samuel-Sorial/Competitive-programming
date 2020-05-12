import java.util.Scanner;

public class ShaassAndOskols {
    /* http://codeforces.com/contest/294/problem/A */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int wiresNumber = in.nextInt();
        int[] wires = new int[wiresNumber];
        in.nextLine();
        for(int i = 0; i < wiresNumber; i++) {
            wires[i] = in.nextInt();
        }
        in.nextLine();
        int totalShots = in.nextInt();
        for(int i = 0; i < totalShots; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            performShot(y ,x - 1,wires);
            in.nextLine();
        }
        for(int i : wires){
            System.out.println(i);
        }
    }

    private static void performShot(int x, int y, int[] wires) {
        int leftBirds = x - 1;
        int rightBirds = wires[y] - x;
        wires[y] = 0;
        if(y+1 < wires.length)
            wires[y+1] += rightBirds;
        if(y-1 >= 0)
            wires[y-1] += leftBirds;
    }
}

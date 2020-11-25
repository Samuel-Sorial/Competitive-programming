import java.util.Scanner;

public class NewPassword {

    /* https://codeforces.com/contest/770/problem/A */

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] string = new int[k];
        int base = 97;
        for(int i=0;i<k;i++) {
            string[i] = base;
            base++;
        }
        int passwordCount = 0;
        while(passwordCount<n) {
            for(int i=0;i<k&&passwordCount<n;i++) {
                System.out.print((char)string[i]);
                passwordCount++;
            }
        }
    }
}

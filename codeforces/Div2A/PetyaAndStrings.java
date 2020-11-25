import java.util.Scanner;

public class PetyaAndStrings {

    /* https://codeforces.com/contest/112/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String firstString = in.nextLine();
        String secondString = in.nextLine();
        int cmp = firstString.compareToIgnoreCase(secondString);
        if( cmp < 0 ) {
            System.out.println(-1);
        } else if (cmp > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

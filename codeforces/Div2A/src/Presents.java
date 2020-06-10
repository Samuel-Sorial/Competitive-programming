import java.util.Scanner;

public class Presents {
    /* http://codeforces.com/contest/136/problem/A */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int totalFriends = in.nextInt();
        int[] gotFrom = new int[totalFriends];
        for(int i = 0; i < totalFriends; i++){
            int curr = in.nextInt() - 1;
            gotFrom[curr] = i + 1;
        }
        for(int i : gotFrom){
            System.out.println(i);
        }
    }
}

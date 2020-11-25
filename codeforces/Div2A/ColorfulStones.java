import java.util.Scanner;

public class ColorfulStones {
    /* http://codeforces.com/contest/265/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stones = in.nextLine();
        String instructions = in.nextLine();
        int position = 0;
        for(int i = 0; i < instructions.length(); i++) {
            if(stones.charAt(position) == instructions.charAt(i))
                position++;
        }
        System.out.println(position + 1);
    }
}

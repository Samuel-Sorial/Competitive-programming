import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class NighAtMuseum {
    /* https://codeforces.com/contest/731/problem/A */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int rotations = 0;
        int curr = 0;
        for(char c : name.toCharArray()) {
            int i = c - 97;
            int walk = Math.abs( curr - i );
            if(walk < 13){
                rotations += walk;
            }
            else{
                rotations +=  26 - walk;
            }
            curr = i;
        }
        System.out.println(rotations);
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyGirl {

    /* https://codeforces.com/contest/236/problem/A */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if(isMale(name)) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }

    private static boolean isMale(String name) {
        Set<Character> nameChars = new HashSet<Character>(); // Set contains only distinct elements.
        for(char c : name.toCharArray()) {
            nameChars.add(c);
        }
        return (nameChars.size() % 2 ) != 0;
    }
}

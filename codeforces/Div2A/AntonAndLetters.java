import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {

    /* https://codeforces.com/contest/443/problem/A */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String totalSetWithBraces = in.nextLine();
        if(totalSetWithBraces.length() <= 2){
            System.out.println(0);
            return;
        }
        String setWithoutBraces = totalSetWithBraces.substring(1, totalSetWithBraces.length() -1);
        String[] letters = setWithoutBraces.split("\\s*,\\s*");
        Set<Character> givenSet = new HashSet<>();
        for(String l : letters)
            givenSet.add(l.charAt(0));
        System.out.println(givenSet.size());
    }
}

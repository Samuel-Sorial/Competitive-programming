import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    /* https://codeforces.com/contest/339/problem/A */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] characters = input.split("\\+");
        Arrays.sort(characters);
        for(int i = 0; i < characters.length; i++){
            if(i == characters.length -1)
                System.out.print(characters[i]);
            else
                System.out.print(characters[i] + "+");
        }
    }
}

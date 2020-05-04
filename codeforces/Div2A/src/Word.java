import java.util.Scanner;

public class Word {
    /* https://codeforces.com/contest/59/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String givenWord = in.nextLine();
        int lowerCase = 0;
        int upperCase = 0;
        for(char c : givenWord.toCharArray()) {
            if(Character.isLowerCase(c)) {
                lowerCase++;
            }else {
                upperCase++;
            }
        }
        if(upperCase <= lowerCase)
            System.out.println(givenWord.toLowerCase());
        else
            System.out.println(givenWord.toUpperCase());
    }
}

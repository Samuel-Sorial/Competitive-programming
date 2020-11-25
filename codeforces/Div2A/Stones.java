import java.util.Scanner;

public class Stones {
    /* https://codeforces.com/contest/266/problem/A */
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int totalChars = in.nextInt();
        char[] chars = in.next().toCharArray();
        System.out.print(pullSame(chars));
    }
    private static int pullSame(char[] chars ) {
        int pulledOut = 0;
        char prev = 'd';
        for(int i = 0; i < chars.length; i++){
            if(i == 0) {
                prev = chars[i];
                continue;
            }
            if(prev == chars[i]) {
                pulledOut++;
                continue;
            }
            prev = chars[i];
        }
        return pulledOut;
    }

}

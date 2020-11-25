import java.util.Scanner;

public class WayTooLongWords {

    /* https://codeforces.com/contest/71/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalWords = in.nextInt();
        String[] words = new String[totalWords];
        in.nextLine();
        for(int i = 0; i < totalWords; i++){
            words[i] = in.nextLine();
        }
        for(String curr : words){
            int length = curr.length();
            if(length <= 10){
                System.out.println(curr);
                continue;
            }
            String builder = curr.charAt(0) + String.valueOf(length-2) + curr.charAt(length-1);
            System.out.println(builder);
        }
    }
}

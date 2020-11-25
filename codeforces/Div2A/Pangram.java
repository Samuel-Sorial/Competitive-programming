import java.util.Scanner;

public class Pangram {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int charsNumbers = in.nextInt();
        in.nextLine();
        String givenWord = in.nextLine().toLowerCase();
        if(charsNumbers < 26){
            System.out.println("NO");
            return;
        }
        for(char i : alphabet.toCharArray()){
            if(givenWord.indexOf(i) == -1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

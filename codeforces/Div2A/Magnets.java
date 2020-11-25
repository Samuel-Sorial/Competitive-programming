import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalLines = in.nextInt();
        in.nextLine();
        int totalGroups = 0;
        int prevValue = 0;
        for(int i = 0; i<totalLines; i++) {
            int j = in.nextInt();
            if(j == prevValue)
                continue;
            else{
                totalGroups++;
                prevValue = j;
            }
            in.nextLine();
        }
        System.out.println(totalGroups);

    }
}

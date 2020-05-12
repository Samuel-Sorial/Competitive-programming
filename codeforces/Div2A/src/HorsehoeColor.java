import java.util.ArrayList;
import java.util.Scanner;

public class HorsehoeColor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> colors = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 4; i++) {
            int next = in.nextInt();
            if(colors.contains(next))
                total++;
            colors.add(next);

        }
        System.out.println(total);
    }
}

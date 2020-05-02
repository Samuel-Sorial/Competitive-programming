import java.util.Scanner;

public class VanyaAndFence {

    private static int requiredWidth(int[] peopleHeight,int allowedHeight) {
        int totalWidth = 0;
        for(int i : peopleHeight) {
            if(i > allowedHeight) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        return totalWidth;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNumbers = in.nextInt();
        int heightOfWall = in.nextInt();
        int[] peopleHeights = new int[totalNumbers];
        for(int i = 0; i<totalNumbers; i++) {
            peopleHeights[i] = in.nextInt();
        }
        System.out.println(requiredWidth(peopleHeights,heightOfWall));
    }
}

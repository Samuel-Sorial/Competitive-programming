import java.util.Scanner;

public class FreeIceCream {

    /* https://codeforces.com/contest/686/problem/A */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int totalRequests = in.nextInt();
        long totalAmount = in.nextInt();
        in.nextLine();
        int distressedChilderen = 0;
        for(int i = 0; i < totalRequests; i++){
            String child = in.nextLine();
            boolean isPositive = isPositive(child);
            int iceCreamPackets = getPackets(child);
            if(isPositive)
                totalAmount += iceCreamPackets;
            else {
                if(totalAmount >= iceCreamPackets)
                    totalAmount -= iceCreamPackets;
                else
                    distressedChilderen++;
            }
        }
        System.out.println(totalAmount + " " + distressedChilderen);
    }

    private static int getPackets(String child) {
        return Integer.parseInt(child.substring(2));
    }

    private static boolean isPositive(String child) {
        return child.contains("+");
    }
}

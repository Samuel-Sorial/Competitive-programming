import java.util.Scanner;

public class PuzzlePieces {
    /* https://codeforces.com/contest/1345/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalTests = in.nextInt();
        Node[] tests = new Node[totalTests];
        in.nextLine();
        for(int i = 0; i <  totalTests;i++ ) {
            int currN = in.nextInt();
            int currM = in.nextInt();
            tests[i] = new Node(currN, currM);
            in.nextLine();
        }
        for(Node n : tests) {
            if(n.n == 1 || n.m == 1)
                System.out.println("YES");
            else if( n.n == 2 && n.m == 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static class Node{
        int n;
        int m;
        public Node(int x, int y){
            n = x;
            m = y;
        }
    }
}

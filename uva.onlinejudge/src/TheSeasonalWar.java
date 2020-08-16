import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSeasonalWar {
    static int dimensions;
    static String[] grid;
    static boolean[][] visited;


    public static boolean valid(int r, int c){
        return ((r >= 0 && r < dimensions && (c >= 0 && c < dimensions)));
    }
    public static boolean dfs (int r, int c){
        if(!valid(r, c) || grid[r].charAt(c) == '0' || visited[r][c])
            return false;
        visited[r][c] = true;
        dfs(r+1 , c);
        dfs(r-1 , c);
        dfs(r , c+1);
        dfs(r , c-1);
        dfs(r+1, c-1);
        dfs(r+1, c+1);
        dfs(r-1, c-1);
        dfs(r-1,c+1);
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        String temp;
        int testCase = 1;
        while((temp = in.readLine()) != null){
            try{
                dimensions = Integer.parseInt(temp);
            }catch (Exception err){
                System.out.print(ans.toString());
            }
           grid = new String[dimensions];
           visited = new boolean[dimensions][dimensions];
           int totalEagles = 0;
           for(int i = 0; i < dimensions; i++){
                grid[i] = in.readLine();
           }
           for(int i = 0; i < dimensions; i++){
               for(int j = 0; j < dimensions; j++){
                if(!visited[i][j] && dfs(i,j))
                    totalEagles++;
               }
           }
           ans.append("Image number ").append(testCase).append(" contains ").append(totalEagles)
                   .append(" war eagles.\n");
           testCase++;
        }
        System.out.print(ans.toString());
    }
}

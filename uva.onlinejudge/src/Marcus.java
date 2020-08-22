import java.util.Scanner;

public class Marcus {
    static String[] grid;
    static boolean[][] visited;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        String[][] totalMaps = new String[tests][];
        for(int i = 0; i < tests; i++){
            int dim = in.nextInt();
            String[] currMap = new String[dim];
            int cols = in.nextInt();
            in.nextLine();
            for(int j = 0; j < dim; j++){
                currMap[j] = in.nextLine();
            }
            totalMaps[i] = currMap;
        }
        for(String[] map : totalMaps){
            findPath(map);
        }
    }

    private static void findPath(String[] map) {
        int cols = map[0].length();
        int startIndex = map[map.length -1].indexOf('@');
        visited = new boolean[map.length][cols];
        System.out.println(dfs(map,map.length -1,startIndex, ""));
    }

    private static String dfs(String[] map, int row, int col, String s) {
        if(visited[row][col])
            return "";
        char currChar = map[row].charAt(col);
        visited[row][col] = true;
        switch (currChar){
            case '@':
                if(col == 0)
                    return dfs(map , row - 1, col, "forth ") + dfs(map, row, col+1, "right ");
                else if(col == map[row].length())
                    return dfs(map , row - 1, col, "forth ") + dfs(map, row, col-1, "left ");
                else
                    return dfs(map , row - 1, col, "forth ") + dfs(map, row, col+1, "right ") + dfs(map, row, col-1, "left ");
            case '#':
                return s;
            case 'I':
            case 'E':
            case 'H':
            case 'O':
            case 'V':
            case 'A':
                if(col == 0)
                    return  s + dfs(map , row - 1, col, "forth ") + dfs(map, row, col+1, "right ");
                else if(col == map[row].length())
                    return s + dfs(map , row - 1, col, "forth ") + dfs(map, row, col-1, "left ");
                else if(row == 0)
                    return  s + dfs(map, row, col+1, "right ") + dfs(map, row, col-1, "left ");
                else
                    return s + dfs(map , row - 1, col, "forth ") + dfs(map, row, col+1, "right ") + dfs(map, row, col-1, "left ");
            default:
                return "";
        }
    }
}

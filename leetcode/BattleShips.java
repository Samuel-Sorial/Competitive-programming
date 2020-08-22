
public class BattleShips {

    public static int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int totalShips = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'X')
                    totalShips += dfs(board,i,j);
            }
        }
        return totalShips;
    }

    private static int dfs(char[][] board, int i, int j) {
        if(i > board.length-1 || i < 0 || j > board[0].length-1 || j < 0 || board[i][j] != 'X')
            return 0;
        board[i][j] = '.';
        dfs(board, i+1,j);
        dfs(board, i, j+1);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        return 1;
    }

}

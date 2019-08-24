/*
 1. Missed up with the horizontal index and veritical index;
 2. difference between "O" and '0'  string and char
 3. Dfs check the up, bottom, left, right.
 */
public class surroundedRegions {
    public static void solver(char[][] board)
    {
        if(board == null || board.length == 0 || board[0].length == 0)
        {
            return;
        }
        if(board.length < 3 || board[0].length < 3)
        {
            return;
        }
        int xLength = board[0].length;
        int yLength = board.length;
        for(int i = 0; i < xLength; i++)
        {
            if (board[0][i] == 'O')
            {
                dfsReplace(board, 0, i);
            }
            if (board[yLength - 1][i]== 'O')
            {
                dfsReplace(board, yLength - 1, i);
            }
        }

        for(int j = 0; j < yLength; j++)
        {
            if (board[j][0] == 'O')
            {
                dfsReplace(board, j, 0);
            }
            if (board[j][xLength - 1] == 'O')
            {
                dfsReplace(board, j, xLength - 1);
            }
        }

        for(int j = 0; j < yLength; j++)
        {
            for(int i = 0; i < xLength; i++)
            {
                if(board[j][i] == '*')
                {
                    board[j][i] = 'O';
                }
                else if (board[j][i] == 'O')
                {
                    board[j][i] = 'X';
                }
            }
        }
    }

    private static void dfsReplace(char[][] board, int i, int j) {
        if (i > board.length - 1 || j  > board[0].length - 1) return;
        if (board[i][j] == 'O')
        {
            board[i][j] = '*';
        }
        if (i > 1 && board[i - 1][j] == 'O')
        {
            dfsReplace(board, i - 1, j);
        }
        if (i < board[0].length - 2 && board[i + 1][j] == 'O')
        {
            dfsReplace(board, i + 1, j);
        }
        if (j > 1 && board[i][j - 1] == 'O')
        {
            dfsReplace(board, i, j - 1);

        }
        if (j < board.length && board[i][j+1] == 'O'){
            dfsReplace(board, i, j + 1);
        }
    }
}

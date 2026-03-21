
class Solution {

    public int numRookCaptures(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return countPawn(board, i, j, 0, 1)
                            + countPawn(board, i, j, 0, -1)
                            + countPawn(board, i, j, 1, 0)
                            + countPawn(board, i, j, -1, 0);
                }
            }
        }

        return 0;
    }

    private int countPawn(char[][] board, int i, int j, int x, int y) {
        while (i >= 0 && i < board.length && j >= 0 && j < board[i].length && board[i][j] != 'B') {
            if (board[i][j] == 'p') {
                return 1;
            }

            i += x;
            j += y;
        }

        return 0;
    }
}

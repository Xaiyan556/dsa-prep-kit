public class NQueen {
// 
    static boolean isSafe(char[][] board, int row, int col) {

        // ⬆️ check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // ↖️ upper-left diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // ↗️ upper-right diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
// above code check validity of position
// below code find all possible position
    static void solve(char[][] board, int row) {
		// setting up (arranging) the queen across board(all combination
        // 🎯 base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // 🟢 place queen
                board[row][col] = 'Q';

                // ⬇️ go next row 
                solve(board, row + 1);

                // 🔴 backtrack 
                board[row][col] = '.';// empty cuurent place
            }
        }
    }

    static void printBoard(char[][] board) {
        System.out.println("----- Solution -----");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';//empty boxes
            }
        }

        solve(board, 0);
    }
}
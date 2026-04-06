class NQueensCountWays {

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

    // 🔢 count solutions instead of printing
    static int solve(char[][] board, int row) {

        // 🎯 base case → one valid solution found
        if (row == board.length) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // 🟢 place queen
                board[row][col] = 'Q';

                // ➕ add solutions from next rows
                count += solve(board, row + 1);

                // 🔴 backtrack
                board[row][col] = '.';
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        int totalWays = solve(board, 0);
        System.out.println("Total ways: " + totalWays);
    }
}
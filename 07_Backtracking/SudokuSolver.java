// 🔥 Complete Sudoku Solver using Backtracking

public class SudokuSolver {

    // 🧠 Check if placing num is valid
    static boolean isSafe(char[][] board, int row, int col, char num) {

        // 🔹➡️check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }

        // 🔹 check column ⬇️
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // 🔹 check 3x3 grid🕸️
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true; // ✅ safe
    }

    // 🔁 Solve Sudoku using backtracking
    static boolean solve(char[][] board) {

        // 🔍 find empty cell
        for (int i = 0; i < 9; i++) {//i--> rows➡️
            for (int j = 0; j < 9; j++) {//j--> column⬇️

                if (board[i][j] == '.') {//check empty place

                    // 🎯 try numbers 1–9
                    for (char num = '1'; num <= '9'; num++) {

                        if (isSafe(board, i, j, num)) {

                            // 🟢 place number
                            board[i][j] = num;

                            // ⬇️ recurse
                            if (solve(board)) {// solution exist
                                return true; // solution found leave recurion
                            }

                            // 🔴 backtrack
                            board[i][j] = '.';
                        }
                    }

                    return false; // ❌ no number works here
                }
            }
        }

        return true; // 🎉 solved
    }

    // 🖨️ Print board
    static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 🚀 Main function
    public static void main(String[] args) {

        // 🧩 Input Sudoku ('.' = empty)
        char[][] board = {
            {'.', '.', '8', '.', '.', '.', '.', '.', '.'},
            {'4', '9', '.', '1', '5', '7', '.', '.', '2'},
            {'.', '.', '3', '.', '.', '4', '1', '9', '.'},

            {'1', '8', '5', '.', '6', '.', '.', '2', '.'},
            {'.', '.', '.', '.', '2', '.', '.', '6', '.'},
            {'9', '6', '.', '4', '5', '3', '.', '.', '.'},

            {'.', '3', '.', '.', '7', '2', '.', '.', '4'},
            {'.', '4', '9', '.', '3', '.', '.', '5', '7'},
            {'8', '2', '7', '.', '.', '9', '.', '1', '3'}
        };

        // 🔍 Solve Sudoku
        if (solve(board)) {
            System.out.println("Solved Sudoku:\n");
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
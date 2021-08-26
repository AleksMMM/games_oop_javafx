package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (monoHorizontal(board, index) || monoVertical(board, index))) {

                return true;
            }
        }
        return false;
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        for (int cell = 0; cell < board.length; cell++) {
            int value = board[row][cell];
            if (value != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            int value = board[row][column];
            if (value != 1) {
                return false;
            }
        }
        return true;
    }

}

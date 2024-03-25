public class WitchesAndPotions {
    private char[][] board;
    private int size;
    private final char SYMBOL = '-';
    private final char WITCH = 'W';
    
    public WitchesAndPotions(int size) {
        this.size = size;
        this.board = initializeBoard();
    }

    private char[][] initializeBoard() {
        char[][] board = new char[size][size];

        for (int row = 0; row < size; row ++) {
            for (int col = 0; col < size; col ++) {
                if (row == col || row == size-col-1) {
                    board[row][col] = WITCH;
                } else {
                    board[row][col] = SYMBOL;
                }
            }
        }

        return board;
    }

    public String toString() {
        String result = "";
        for (char[] row: board) {
            for(char el: row) {
                result += el + "  ";
            }
            result += "\n";
        }
        return result;
    }
}
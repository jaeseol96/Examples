public class CharMatrix {
    private char[][] matrix;
        private int rows;
        private int cols;
        private char symbol;
        private boolean isEmpty;

    public CharMatrix(int rows, int cols, char symbol) {
        //assuming rows cols are non zero positive numbers 
        this.rows = rows;
        this.cols = cols;
        this.symbol = symbol;
        matrix = new char[rows][cols];
        isEmpty = true;
        initialFill();

    }

    private void initialFill() {
        fillAllDash();
    }

    public void empty() {
        matrix = new char[rows][cols];
        initialFill();
        isEmpty = true;
    }

    public void fillFrontDiagonal() {
        int row = 0;
        while (row < rows && row < cols) {
            matrix[row][row] = symbol;
            row ++;
        }
        
        isEmpty = false;
    }

    public void fillBackDiagonal() {
        int row = 0;
        while (row < rows && row < cols) {
            matrix[row][cols-1-row] = symbol;
            row ++;
        }
        isEmpty = false;
    }

    public void fillAboveDiagonal() {
        for (int row = 0; row < rows; row ++) {
            for (int col = row; col < cols; col ++) {
                matrix[row][col] = symbol; 
            }
        }
        isEmpty = false;
    }

    public void fillBelowDiagonal() {
        for (int row = 0; row < rows; row ++) {
            for (int col = 0; col <= row; col ++) {
                matrix[row][col] = symbol;
            }
        }
        isEmpty = false;
    }

    public void fillEvenCols() {
        for (int row = 0; row < rows; row ++) {
            for (int col = 0; col<cols; col ++) {
                if (col%2 == 0)
                matrix[row][col] = symbol;
            }
        }
        isEmpty = false;
    }

    public void fillEvenRows() {
        for (int row = 0; row < rows; row ++) {
            if (row %2 == 0) {
                for (int i = 0; i < cols; i ++) {
                    matrix[row][i] = symbol;
                }
            }
        }
        isEmpty = false;
    }

    public void fillChessBoard() {
        for (int row = 0; row < rows; row ++) {
            if (row %2 == 0) {
                for (int col = 0; col < cols; col += 2) {
                        matrix[row][col] = symbol;
                    }
                } else {
                for (int col = 1; col < cols; col += 2) {
                        matrix[row][col] = symbol;
                    }
                }
            }
        isEmpty = false;
    }
    

    public void fillChessBoardRecursive() {
        //first row fill even col cells
        //second row fill odd col cells so on
        isEmpty = false; 
        fillRowRec(0, 0);
    }

    private void fillRowRec(int currRow, int cellIndex) {
        if (currRow < rows){
            fillColRec(currRow, cellIndex);
            fillRowRec(currRow + 1,(cellIndex+1)%2);
        }
    }

    private void fillColRec(int currRow, int cellIndex) {
        if (cellIndex < cols) {
            matrix[currRow][cellIndex] = symbol;
            fillColRec(currRow, cellIndex+2);
        }
    }

    public void fillTopHalf() {
        for (int i = 0; i < rows/2; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                matrix[i][j] = symbol;
            }
        }
        isEmpty= false;
        
    }

    public void fillAll() {
        for (char[] row: matrix) {
            for(int i = 0; i < row.length; i ++) {
                row[i] = symbol;  
            }
        }
        isEmpty = false;
    }

    private void fillAllDash() {
        for (char[] row: matrix) {
            for(int i = 0; i < row.length; i ++) {
                row[i] = '-';  
            }
        }
    }

    public String toString() {
        String result = "";
        if (isEmpty) {
            result += "You CharMatrix is Empty"; 
        } else {
            for (char[] row: matrix) {
                for(char el: row) {
                    result += el + "  " ; 
                }
                result += "\n";
            }
        }
        return result; 
    }

}

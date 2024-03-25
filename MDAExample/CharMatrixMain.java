public class CharMatrixMain {
    public static void main(String[] args) {
        final int NUM_ROWS = 5;
        final int NUM_COLS = 8;
        final char SYMBOL = 'X';
        CharMatrix cm = new CharMatrix(NUM_ROWS, NUM_COLS
        , SYMBOL);
        System.out.println("New Matrix Created");
        System.out.println(cm);

        cm.fillChessBoardRecursive();
        System.out.println(cm);

    }
}
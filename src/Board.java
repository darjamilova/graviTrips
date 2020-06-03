import java.lang.reflect.Array;

public class Board {
    private int width;
    private int height;

    private final char EMPTY_FIELD = 'z';

    private char[][] boardTable;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        boardTable = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.boardTable[i][j] = EMPTY_FIELD;
            }
        }
    }

    public char[][] getBoardTable() {
        return boardTable;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void drawField() {
        for (int j = 1; j < width + 1; j++) {
            System.out.print(j);
        }
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(boardTable[i][j]);
            }
        }
    }

    public boolean saveMoveIfPossible(Player player, int positionWidth) {
        positionWidth--; //board starts with 1, array starts with 0
        if (positionWidth >= getWidth()) return false;
        else if (positionWidth <= 0) return false;
        else
            for (int i = getHeight() - 1; i > -1; i--) {
                if (isPositionAvailable(positionWidth, i)) {
                    savePlayerMove(player, positionWidth, i);
                    return true;
                }
            }
        return false;
    }

    private void savePlayerMove(Player player, int width, int height) {
        boardTable[height][width] = player.getName();

    }

    private boolean isPositionAvailable(int width, int height) {
        return boardTable[height][width] == EMPTY_FIELD;
    }
}

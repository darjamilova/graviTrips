package GraviTrips;

public class Board {
    private int width;
    private int height;
    private int spaceForMove;
    private final char EMPTY_FIELD = 'z';
    private char[][] boardTable;

    public int getSpaceForMove() {
        return spaceForMove;
    }

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        spaceForMove=width*height;
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
        if (boardTable[0][positionWidth] != EMPTY_FIELD) return false;
        else
            for (int i = getHeight() - 1; i > -1; i--) {
                if (isPositionAvailable(positionWidth, i)) {
                    boardTable[i][positionWidth] = player.getName();
                    spaceForMove--;
                    return true;
                }
            }
        return false;
    }

    private boolean isPositionAvailable(int width, int height) {
        return boardTable[height][width] == EMPTY_FIELD;
    }
}

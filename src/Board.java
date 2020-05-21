import java.lang.reflect.Array;

public class Board {
    private int width;
    private int height;

    private enum Symbols {
        X,
        O,
        Z
    }

  //  private Board.Symbols[][] boardTable = new Board.Symbols[width][height];

    public Symbols[][] getBoardTable() {
        return boardTable;
    }

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < width-1; i++) {
            for (int j = 0; j < height-1; j++) {
                boardTable[i][j] = Symbols.Z;
            }
        }
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
        for (int i = 0; i < width-1; i++) {
            System.out.println();
            for (int j = 0; j < height-1; j++) {
                System.out.print(boardTable[i][j]);
            }
        }
    }
}

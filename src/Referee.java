public class Referee {
    private Player winner;
    public Board prepareBoard() {
        System.out.println("Input board width");
        int width = Integer.valueOf(Helper.readFromConsole());
        System.out.println("Input board height");
        int height = Integer.valueOf(Helper.readFromConsole());
        return new Board(width, height);
    }

    public Player getPlayerType() {
        System.out.println("Is Player a computer? Y/N");
        String answer = Helper.readFromConsole().toLowerCase();
        if (answer.equals("y")) {
            return new PlayerComputer();
        } else {
            return new PlayerPerson();
        }
    }


    public boolean checkForWin(Board board, Player player) {
        boolean isWin = false;
        char playerName = player.getName();
        for (int i = 0; i < board.getWidth(); i++) {
            for (int j = 0; j < board.getHeight(); j++) {
                isWin = checkDiagonalUpForPoint(i, j, board, playerName) ||
                        checkDiagonalDownForPoint(i, j, board, playerName) ||
                        checkVerticalForPoint(i, j, board, playerName) ||
                        checkHorizontalForPoint(i, j, board, playerName);
                if (isWin) {
                    this.winner = player;
                    return isWin;
                }
            }
        }
        return isWin;
    }

    private boolean checkHorizontalForPoint(int pointHeight, int pointWidth, Board board, char playerName) {
        boolean isWin = true;
        if (board.getWidth() - pointWidth < 4)
            return false;
        else {
            char[][] boardTable = board.getBoardTable();
            for (int i = 0; i < 4; i++) {
                boolean nextSymbolIsSame = boardTable[pointHeight][pointWidth + i] == playerName;
                isWin = isWin && nextSymbolIsSame;
                if (!isWin) break;
            }
        }
        return isWin;
    }

    private boolean checkVerticalForPoint(int pointHeight, int pointWidth, Board board, char playerName) {
        boolean isWin = true;
        if (board.getHeight() - pointHeight < 4)
            return false;
        else {
            char[][] boardTable = board.getBoardTable();
            for (int i = 0; i < 4; i++) {
                boolean nextSymbolIsSame = boardTable[pointHeight + i][pointWidth] == playerName;
                isWin = isWin && nextSymbolIsSame;
                if (!isWin) break;
            }
        }
        return isWin;
    }

    private boolean checkDiagonalUpForPoint(int pointHeight, int pointWidth, Board board, char playerName) {
        boolean isWin = true;
        if (pointHeight < 3 || board.getWidth() - pointWidth < 4)
            return false;
        else {
            char[][] boardTable = board.getBoardTable();
            for (int i = 0; i < 4; i++) {
                boolean nextSymbolIsSame = boardTable[pointHeight - i][pointWidth + i] == playerName;
                isWin = isWin && nextSymbolIsSame;
                if (!isWin) break;
            }
        }
        return isWin;
    }

    private boolean checkDiagonalDownForPoint(int pointHeight, int pointWidth, Board board, char playerName) {
        boolean isWin = true;
        if (board.getHeight() - pointHeight < 4 || board.getWidth() - pointWidth < 4)
            return false;
        else {
            char[][] boardTable = board.getBoardTable();
            for (int i = 0; i < 4; i++) {
                boolean nextSymbolIsSame = boardTable[pointHeight + i][pointWidth + i] == playerName;
                isWin = isWin && nextSymbolIsSame;
                if (!isWin) break;
            }
        }
        return isWin;
    }

    public void processPlayerMove(Player player, Board board) {
        boolean moveIsPossible;

        System.out.println();
        do {
            int moveIndex = player.attemptMove(board);
            moveIsPossible = board.saveMoveIfPossible(player, moveIndex);
            if (!moveIsPossible) System.out.println("Oooops! Something went wrong here!");
        } while (!moveIsPossible);
    }

    public void detectWinner(Board board){
        board.drawField();
        if (board.getSpaceForMove() == 0) {
            System.out.println("\n\nCongratulations! It is a draw!");

        } else System.out.println("\n\nCongratulations! Winner is " + this.winner.getName());
    }
}

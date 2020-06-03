public class Referee {
    public Board prepareBoard() {
        System.out.println("Input board width");
        int width = Integer.valueOf(Helper.readFromConsole());
        System.out.println("Input board height");
        int height = Integer.valueOf(Helper.readFromConsole());
        return new Board(width, height);
    }

    public Player getPlayerType() {
        System.out.println("Is Player a computer? Y/N");
        String answer = Helper.readFromConsole();
        if (answer == "Y") {
            return new PlayerComputer();
        } else {
            return new PlayerPerson();
        }
    }

    public int getPlayerMove(Player player, int boardWidth) {
        System.out.println("Please enter column number");
        return player.attemptMove(boardWidth);
    }


    public boolean checkForWin(Board board, Player player) {
        char playerName = player.getName();


        return false;
    }

    private boolean checkHorizontalForPoint(int height, int width, char[][] borrdTable, char playerName) {

        return false;
    }

    private boolean checkVerticalForPoint(int height, int width, char[][] borrdTable, char playerName) {
        return false;
    }

    private boolean checkDiagonalForPoint(int height, int width, char[][] borrdTable, char playerName) {
        return false;
    }
}

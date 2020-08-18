package GraviTrips;

public class Main {

    public static void main(String[] args) {
        Referee referee = new Referee();
        Board board = referee.prepareBoard();

        Player player = referee.getPlayerType();
        player.setName('X');
        Player player2 = referee.getPlayerType();
        player2.setName('O');

        boolean isWin;
        do {
            if (board.getSpaceForMove() == 0) break;
            board.drawField();
            referee.processPlayerMove(player, board);
            isWin = referee.checkForWin(board, player);
            if (!isWin) {
                board.drawField();
                referee.processPlayerMove(player2, board);
                isWin = referee.checkForWin(board, player2);
            }
        } while (!isWin);

        referee.detectWinner(board);
    }
}

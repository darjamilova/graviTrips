public class Main {

    public static void main(String[] args) {
        Referee referee = new Referee();
        Board board = referee.prepareBoard();

        Player player=new PlayerPerson();
        player.setName('A');
        Player player2=new PlayerPerson();
        player2.setName('B');
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player, player.attemptMove(board.getWidth()));
        board.saveMoveIfPossible(player2, player.attemptMove(board.getWidth()));

        board.drawField();


        System.out.println(referee.checkForWin(board, player2));



    }
}

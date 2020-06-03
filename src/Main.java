public class Main {

    public static void main(String[] args) {
        Referee referee = new Referee();
        Board board = referee.prepareBoard();

        Player player=new PlayerPerson();
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
        System.out.println(player.attemptMove(board.getWidth()));
//        player.setName('A');
//        board.saveMoveIfPossible(player, 4);
//        board.saveMoveIfPossible(player, 4);
//        board.drawField();


    }
}

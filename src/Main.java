public class Main {

    public static void main(String[] args) {
        Referee referee = new Referee();
        Board board = referee.prepareBoard();
        System.out.println(board.getHeight());
        System.out.println(board.getWidth());
        board.drawField();
    }
}

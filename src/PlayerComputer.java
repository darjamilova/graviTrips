import java.util.concurrent.ThreadLocalRandom;

public class PlayerComputer implements Player{

    private char name;
    private Board board;

    @Override
    public int attemptMove(Board board) {
        System.out.println("It is player's "+ this.getName()+ " turn!");
        int randomNum = ThreadLocalRandom.current().nextInt(1, board.getWidth() +1);
        return randomNum;
    }

    @Override
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
}

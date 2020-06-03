import java.util.concurrent.ThreadLocalRandom;

public class PlayerComputer implements Player{

    private char name;

    @Override
    public int attemptMove(int boardWidth) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, boardWidth+1);
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

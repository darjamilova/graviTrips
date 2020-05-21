import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Referee {
    public Board prepareBoard() {
        System.out.println("Input board width");
        int width = Integer.valueOf(readFromConsole());
        System.out.println("Input board height");
        int height = Integer.valueOf(readFromConsole());
        return new Board(width, height);
    }

    public Player getPlayerType() {
        System.out.println("Is Player 1 a computer? Y/N");
        String answer = readFromConsole();
        if (answer == "Y") {
            return new PlayerComputer();
        } else {
            return new PlayerPerson();
        }
    }

    private String readFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public boolean checkForWin(Board board){
//
//    }

}

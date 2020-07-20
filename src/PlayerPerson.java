public class PlayerPerson implements Player {
    private char name;

    @Override
    public int attemptMove(Board board) {
        int answer;
        System.out.println("It is player's "+ this.getName()+ " turn!");
        System.out.println("Enter your move");
        answer = Integer.valueOf(Helper.readFromConsole());
        while (answer > board.getWidth() || answer <= 0) {
            System.out.println("Try again. Max width is " + board);
            answer = Integer.valueOf(Helper.readFromConsole());
        }
        return answer;
    }

    @Override
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

}

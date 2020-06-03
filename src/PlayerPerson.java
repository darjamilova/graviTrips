public class PlayerPerson implements Player {


    private char name;
    @Override
    public int attemptMove(int boardWidth) {
        int answer;
        System.out.println("Enter your move");
        answer = Integer.valueOf(Helper.readFromConsole());
        while (answer > boardWidth || answer<=0) {
            System.out.println("Try again. Max width is " + boardWidth);
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

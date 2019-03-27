import java.util.Scanner;

public class GuessNumber {

    private String playerName;
    private int hiddenNumber;
    private int playerNumber;
    Scanner scanNumber = new Scanner(System.in);

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);
    }

    public int inputNumber(String playerName) {
        this.playerName = playerName;
        System.out.print(playerName + " guess number: ");
        return scanNumber.nextInt();
    }

    public void numberСomparison(int playerNumber) {
        this.playerNumber = playerNumber;
        if (playerNumber > hiddenNumber) {
            System.out.println("Hidden number less than " + playerNumber);
        } else if (playerNumber < hiddenNumber) {
            System.out.println("Hidden number greater than " + playerNumber);
        } else {
            System.out.println(playerName + " guessed right hidden number!");
        }
    }
}
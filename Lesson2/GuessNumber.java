import java.util.Scanner;

public class GuessNumber {

    Player playerOne;
    Player playerTwo;
    private int hiddenNumber;
    Scanner scanNumber = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void setHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);
        System.out.println(hiddenNumber);
    }

    public void guess() {
        do {
            System.out.print(playerOne.getName() + " guess number: ");
            playerOne.setNumber(scanNumber.nextInt());
            if (playerOne.getNumber() > hiddenNumber) {
                System.out.println("Hidden number less than " + playerOne.getNumber());
            } else if (playerOne.getNumber() < hiddenNumber) {
                System.out.println("Hidden number greater than " + playerOne.getNumber());
            } else {
                System.out.println(playerOne.getName() + " guessed right hidden number!");
                break;
            }

            System.out.print(playerTwo.getName() + " guess number: ");
            playerTwo.setNumber(scanNumber.nextInt());
            if (playerTwo.getNumber() > hiddenNumber) {
                System.out.println("Hidden number less than " + playerTwo.getNumber());
            } else if (playerTwo.getNumber() < hiddenNumber) {
                System.out.println("Hidden number greater than " + playerTwo.getNumber());
            } else {
                System.out.println(playerTwo.getName() + " guessed right hidden number!");
            }
        } while (playerOne.getNumber() != hiddenNumber && playerTwo.getNumber() != hiddenNumber);
    }
}
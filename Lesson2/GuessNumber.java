import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int hiddenNumber;
    Scanner scanNumber = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void guess() {
        generateHiddenNumber();
        do {
            inputPlayerNumber(playerOne);
            compareNumbers(playerOne);
            if (playerOne.getNumber() == hiddenNumber) {
                break;
            }
            inputPlayerNumber(playerTwo);
            compareNumbers(playerTwo);
        } while (playerTwo.getNumber() != hiddenNumber);
    }

    private void generateHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);
        System.out.println(hiddenNumber);
    }

    private void inputPlayerNumber(Player player) {
        System.out.print(player.getName() + " guess number: ");
        player.setNumber(scanNumber.nextInt());
    }

    private void compareNumbers(Player player) {
        if (player.getNumber() > hiddenNumber) {
            System.out.println("Hidden number less than " + player.getNumber());
        } else if (player.getNumber() < hiddenNumber) {
            System.out.println("Hidden number greater than " + player.getNumber());
        } else {
            System.out.println(player.getName() + " guessed right hidden number!");
        }
    }
}
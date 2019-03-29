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
        setHiddenNumber();
        do {
            compare(playerOne);
            compare(playerTwo);
        } while (hiddenNumber != 101);
    }

    private void setHiddenNumber() {
        hiddenNumber = (int)(Math.random() * 101);
        System.out.println(hiddenNumber);
    }

    private void compare(Player player) {
        if (hiddenNumber != 101) {  //Если первый игрок угадал число, то ход второго пропустится
            System.out.print(player.getName() + " guess number: ");
            player.setNumber(scanNumber.nextInt());
            if (player.getNumber() > hiddenNumber) {
                System.out.println("Hidden number less than " + player.getNumber());
            } else if (player.getNumber() < hiddenNumber) {
                System.out.println("Hidden number greater than " + player.getNumber());
            } else {
                System.out.println(player.getName() + " guessed right hidden number!");
                hiddenNumber = 101;
            }
        }
    }
}
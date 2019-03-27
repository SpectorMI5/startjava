import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Enter second player name: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber guess = new GuessNumber();
        String choice;

        do {
            guess.setHiddenNumber();
            while (true) {
                playerOne.setNumber(guess.inputNumber(playerOne.getName()));
                guess.numberСomparison(playerOne.getNumber());
                if (playerOne.getNumber() == guess.getHiddenNumber()) {
                    break;
                }
                playerTwo.setNumber(guess.inputNumber(playerTwo.getName()));
                guess.numberСomparison(playerTwo.getNumber());
                if (playerTwo.getNumber() == guess.getHiddenNumber()) {
                    break;
                }
            }
            do {
                System.out.print("Want to continue? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
    }
}
import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        int i;
        String choice;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first player name: ");
        Player playerOne = new Player(scan.nextLine());
        System.out.print("Enter second player name: ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber guess1 = new GuessNumber();

        do {
            guess1.setHiddenNumber((int)(Math.random() * 101));
            do {
                System.out.print("First player guess number: ");
                playerOne.setNumber(scan.nextInt());
                guess1.setGuessNumber(playerOne.getNumber());
                i = 1;
                if (playerOne.getNumber() == guess1.getHiddenNumber()) {
                    break;
                }
                guess1.guess();

                System.out.print("Second player guess number: ");
                playerTwo.setNumber(scan.nextInt());
                guess1.setGuessNumber(playerTwo.getNumber());
                i = 2;
                guess1.guess();

            } while(playerOne.getNumber() != guess1.getHiddenNumber() && playerTwo.getNumber() != guess1.getHiddenNumber());

            if (i == 1) {
                System.out.println(playerOne.getName() + " guessed right hidden number!");
            } else {
                System.out.println(playerTwo.getName() + " guessed right hidden number!");
            }
            scan.nextLine();
            do {
                System.out.print("Want to continue? [yes/no]: ");
                choice = scan.nextLine();
            } while (!choice.equals("yes") && !choice.equals("no"));
        } while (choice.equals("yes"));
    }
}